package oopexe1;

public class exe13Rectangle {
	private float length;
	private float width;
	
	public exe13Rectangle() {
		this.length=1.0f;
		this.width= 1.0f;
	}

	public exe13Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	public float getArea() {
		return length*width;
	}
	
	public float getPerimeter() {
		return (length+width)*2;
	}
	
	public String toString() {
		return "Rectangle[length= "+ this.length+",width= "+this.width+"]";
	}
	
	public static void main(String[] args) {
		exe13Rectangle r1= new exe13Rectangle(1.2f , 3.4f);
		System.out.println(r1);
		exe13Rectangle r2 = new exe13Rectangle();
		System.out.println(r2);
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		System.out.println("lenght is: "+r1.getLength());
		System.out.println("width is: "+r1.getWidth());
		System.out.println("area is: "+r1.getArea());
		System.out.println("Perimeter is: "+r1.getPerimeter());
	}
	
}
