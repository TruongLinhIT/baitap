package oopexe4;

public class exe41Circle {
	private double radius;
	public String color;
	
	public exe41Circle() {
		this.radius=1;
		this.color="red";
	}
	

	public exe41Circle(double radius) {
		super();
		this.radius = radius;
	}


	public exe41Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
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

	@Override
	public String toString() {
		return "exe41Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	
	
}
