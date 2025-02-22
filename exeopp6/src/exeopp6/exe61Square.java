package exeopp6;

public class exe61Square extends exe61Rectangle {
	public exe61Square() {}

    public exe61Square(double side) {
        super(side, side);
    }

    public exe61Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width; // width và length bằng nhau
    }

    public void setSide(double side) {
        this.width = this.length = side;
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
    public static void main(String[] args) {
    	exe61Shape s1 = new exe61Circle(5.5, "red", false);  // Upcast Circle to Shape
    	System.out.println(s1);                    // which version?
    	System.out.println(s1.getArea());          // which version?
    	System.out.println(s1.getPerimeter());     // which version?
    	System.out.println(s1.getColor());
    	System.out.println(s1.isFilled());
    	
    	   
    	exe61Circle c1 = (exe61Circle)s1;                   // Downcast back to Circle
    	System.out.println(c1);
    	System.out.println(c1.getArea());
    	System.out.println(c1.getPerimeter());
    	System.out.println(c1.getColor());
    	System.out.println(c1.isFilled());
    	System.out.println(c1.getRadius());
    	   
    	
    	   
    	exe61Shape s3 = new exe61Rectangle(1.0, 2.0, "red", false);   // Upcast
    	System.out.println(s3);
    	System.out.println(s3.getArea());
    	System.out.println(s3.getPerimeter());
    	System.out.println(s3.getColor());
    	
    	   
    	exe61Rectangle r1 = (exe61Rectangle)s3;   // downcast
    	System.out.println(r1);
    	System.out.println(r1.getArea());
    	System.out.println(r1.getColor());
    	System.out.println(r1.getLength());
    	   
    	exe61Shape s4 = new exe61Square(6.6);     // Upcast
    	System.out.println(s4);
    	System.out.println(s4.getArea());
    	System.out.println(s4.getColor());
    	
    	  
    	// Take note that we downcast Shape s4 to Rectangle, 
    	//  which is a superclass of Square, instead of Square
    	exe61Rectangle r2 = (exe61Rectangle)s4;
    	System.out.println(r2);
    	System.out.println(r2.getArea());
    	System.out.println(r2.getColor());
    	System.out.println(r2.getLength());
    	   
    	// Downcast Rectangle r2 to Square
    	exe61Square sq1 = (exe61Square)r2;
    	System.out.println(sq1);
    	System.out.println(sq1.getArea());
    	System.out.println(sq1.getColor());
    	System.out.println(sq1.getSide());
    	System.out.println(sq1.getLength());
    }

}
