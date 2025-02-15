package oopexe1;

public class exe11 {
	private double radius;
	private String color;
	
	public exe11() {
		this.radius=1;
		this.color = "red";
	}
	
	

	public exe11(double radius) {
		this.radius = radius;
		this.color = "red";
	}



	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public String toString() { 
		   return "Circle[radius=" + radius + " color=" + color + "]"; 
		}
	
	public static void main(String[] args) {
//		exe11 c1= new exe11();
//		System.out.println("ban kinh cua hinh tron: "+c1.getRadius());
//		System.out.println("dien tich cua hinh tron: "+c1.getArea());
		
		exe11 c2= new exe11(2);
//		System.out.println("ban kinh cua hinh tron: "+c2.getRadius());
//		System.out.println("dien tich cua hinh tron: "+c2.getArea());
		System.out.println(c2);
	}
	
	
	

}
