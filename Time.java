package oopexe1;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second) {
		this.hour= hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String toString() {
		return this.hour+":"+this.minute+":"+this.second;
	}
	
	public Time nextSecond() {
		this.second = this.second +1;
		if (this.second == 60) {
			this.second = 00;
			this.minute = this.minute +1;
			if(this.minute == 60) {
				this.minute = 00;
				this.hour = this.hour +1;
				if (this.hour == 24) {
					this.hour =0;
				}
			}
		}
		return this;
	}
	
	public Time previousSecond() {
		this.second = this.second -1;
		if (this.second == 00) {
			this.second = 60;
			this.minute = this.minute -1;
			if(this.minute == 00) {
				this.minute = 60;
				this.hour = this.hour -1;
				if (this.hour == 00) {
					this.hour =23;
				}
			}
		}
		return this;
	}
	
	public static void main(String[] args) {
		Time t1 = new Time(1, 2, 3); 
	      System.out.println(t1);   // toString() // Kiểm tra các hàm thiết lập và lấy thông tin 
	      t1.setHour(4); 
	      t1.setMinute(5); 
	      t1.setSecond(6); 
	      System.out.println(t1);   // toString() 
	      System.out.println("Giờ: " + t1.getHour()); 
	      System.out.println("Phút: " + t1.getMinute()); 
	      System.out.println("Giây: " + t1.getSecond()); // Kiểm tra setTime() 
	      t1.setTime(23, 59, 58); 
	      System.out.println(t1);   // toString() // Kiểm tra nextSecond(); 
	      System.out.println(t1.nextSecond()); 
	      System.out.println(t1.nextSecond().nextSecond()); // Kiểm tra previousSecond() 
	      System.out.println(t1.previousSecond()); 
	      System.out.println(t1.previousSecond().previousSecond()); 
	}
	
	

}
