package oopexe3;

public class exe35MyDate {
	
	    private int year;
	    private int month;
	    private int day;

	    private static final String[] MONTHS = 
	        {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	    private static final String[] DAYS = 
	        {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	    private static final int[] DAYS_IN_MONTHS = 
	        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	    // Constructor
	    public exe35MyDate(int year, int month, int day) {
	        setDate(year, month, day);
	    }

	    // Kiểm tra năm nhuận
	    private boolean isLeapYear(int year) {
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    }

	    // Kiểm tra ngày hợp lệ
	    private boolean isValidDate(int year, int month, int day) {
	        if (year < 1 || year > 9999 || month < 1 || month > 12) {
	            return false;
	        }
	        int maxDays = DAYS_IN_MONTHS[month - 1];
	        if (month == 2 && isLeapYear(year)) {
	            maxDays = 29;
	        }
	        return day >= 1 && day <= maxDays;
	    }

	    // Công thức Zeller để xác định ngày trong tuần
	    private int getDayOfWeek(int year, int month, int day) {
	        if (month < 3) {
	            month += 12;
	            year--;
	        }
	        int k = year % 100;
	        int j = year / 100;
	        int h = (day + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
	        return (h + 6) % 7; // Chuyển từ hệ Zeller sang hệ ngày bắt đầu từ Chủ nhật
	    }

	    // Đặt ngày hợp lệ
	    public void setDate(int year, int month, int day) {
	        if (isValidDate(year, month, day)) {
	            this.year = year;
	            this.month = month;
	            this.day = day;
	        } else {
	            throw new IllegalArgumentException("Invalid year, month, or day!");
	        }
	    }

	    // Getter methods
	    public int getYear() { return year; }
	    public int getMonth() { return month; }
	    public int getDay() { return day; }

	    // Setter methods (có kiểm tra hợp lệ)
	    public void setYear(int year) {
	        if (isValidDate(year, month, day)) {
	            this.year = year;
	        } else {
	            throw new IllegalArgumentException("Invalid year!");
	        }
	    }

	    public void setMonth(int month) {
	        if (isValidDate(year, month, day)) {
	            this.month = month;
	        } else {
	            throw new IllegalArgumentException("Invalid month!");
	        }
	    }

	    public void setDay(int day) {
	        if (isValidDate(year, month, day)) {
	            this.day = day;
	        } else {
	            throw new IllegalArgumentException("Invalid day!");
	        }
	    }

	    // Chuyển đổi sang định dạng "Tuesday 14 Feb 2021"
	    @Override
	    public String toString() {
	        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
	    }

	    // Chuyển sang ngày kế tiếp
	    public exe35MyDate nextDay() {
	        if (isValidDate(year, month, day + 1)) {
	            day++;
	        } else if (month < 12) {
	            day = 1;
	            month++;
	        } else {
	            day = 1;
	            month = 1;
	            year++;
	        }
	        return this;
	    }

	    // Chuyển sang tháng kế tiếp
	    public exe35MyDate nextMonth() {
	        if (month == 12) {
	            month = 1;
	            year++;
	        } else {
	            month++;
	        }
	        int maxDays = DAYS_IN_MONTHS[month - 1];
	        if (month == 2 && isLeapYear(year)) {
	            maxDays = 29;
	        }
	        if (day > maxDays) {
	            day = maxDays;
	        }
	        return this;
	    }

	    // Chuyển sang năm kế tiếp
	    public exe35MyDate nextYear() {
	        if (year < 9999) {
	            year++;
	        } else {
	            throw new IllegalArgumentException("Year out of range!");
	        }
	        if (month == 2 && day == 29 && !isLeapYear(year)) {
	            day = 28;
	        }
	        return this;
	    }

	    // Trở về ngày trước đó
	    public exe35MyDate previousDay() {
	        if (day > 1) {
	            day--;
	        } else if (month > 1) {
	            month--;
	            day = DAYS_IN_MONTHS[month - 1];
	            if (month == 2 && isLeapYear(year)) {
	                day = 29;
	            }
	        } else {
	            month = 12;
	            day = 31;
	            year--;
	        }
	        return this;
	    }

	    // Trở về tháng trước đó
	    public exe35MyDate previousMonth() {
	        if (month == 1) {
	            month = 12;
	            year--;
	        } else {
	            month--;
	        }
	        int maxDays = DAYS_IN_MONTHS[month - 1];
	        if (month == 2 && isLeapYear(year)) {
	            maxDays = 29;
	        }
	        if (day > maxDays) {
	            day = maxDays;
	        }
	        return this;
	    }

	    // Trở về năm trước đó
	    public exe35MyDate previousYear() {
	        if (year > 1) {
	            year--;
	        } else {
	            throw new IllegalArgumentException("Year out of range!");
	        }
	        if (month == 2 && day == 29 && !isLeapYear(year)) {
	            day = 28;
	        }
	        return this;
	    
	}
	    public static void main(String[] args) {
	    	exe35MyDate d1 = new exe35MyDate(2012, 2, 28);
	    	System.out.println(d1);             // Tuesday 28 Feb 2012
	    	System.out.println(d1.nextDay());   // Wednesday 29 Feb 2012
	    	System.out.println(d1.nextDay());   // Thursday 1 Mar 2012
	    	System.out.println(d1.nextMonth()); // Sunday 1 Apr 2012
	    	System.out.println(d1.nextYear());  // Monday 1 Apr 2013

	    	exe35MyDate d2 = new exe35MyDate(2012, 1, 2);
	    	System.out.println(d2);                 // Monday 2 Jan 2012
	    	System.out.println(d2.previousDay());   // Sunday 1 Jan 2012
	    	System.out.println(d2.previousDay());   // Saturday 31 Dec 2011
	    	System.out.println(d2.previousMonth()); // Wednesday 30 Nov 2011
	    	System.out.println(d2.previousYear());  // Tuesday 30 Nov 2010

	    	exe35MyDate d3 = new exe35MyDate(2012, 2, 29);
	    	System.out.println(d3.previousYear());  // Monday 28 Feb 2011

	    	// MyDate d4 = new MyDate(2099, 11, 31); // Invalid year, month, or day!
	    	// MyDate d5 = new MyDate(2011, 2, 29); 
		}

}
