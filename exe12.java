package oopexe1;

public class exe12 {
	private double radius;
	
	public exe12() {
		this.radius =1;
	}
	public exe12(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle[radius= "+ this.radius +"]";
	}
	
	public static void main(String[] args) {
		exe12 c1 = new exe12(1.1); 
	      System.out.println(c1);    // toString() 
	      exe12 c2 = new exe12(); // hàm tạo mặc định 
	      System.out.println(c2); // Kiểm tra bộ thiết lập và bộ lấy 
	      c1.setRadius(2.2); 
	      System.out.println(c1);       // toString() 
	      System.out.println("bán kính là: " + c1.getRadius()); // Kiểm tra getArea() và getCircumference() 
	      System.out.printf("diện tích là: %.2f%n", c1.getArea()); 
	      System.out.printf("chu vi là: %.2f%n", c1.getCircumference());
	}

}
