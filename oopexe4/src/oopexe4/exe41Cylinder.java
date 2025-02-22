package oopexe4;

public class exe41Cylinder extends exe41Circle {
	private double height;  // private variable
	   
	   // Constructor with default color, radius and height
	   public exe41Cylinder() {
	      super();        // call superclass no-arg constructor Circle()
	      height = 1.0; 
	   }
	   // Constructor with default radius, color but given height
	   public exe41Cylinder(double height) {
	      super();        // call superclass no-arg constructor Circle()
	      this.height = height;
	   }
	   // Constructor with default color, but given radius, height
	   public exe41Cylinder(double radius, double height) {
	      super(radius);  // call superclass constructor Circle(r)
	      this.height = height;
	   }
	   
	   // A public method for retrieving the height
	   public double getHeight() {
	      return height; 
	   }
	  
	   // A public method for computing the volume of cylinder
	   //  use superclass method getArea() to get the base area
	   public double getVolume() {
	      return getArea()*height; 
	   }
	   public static void main(String[] args) {
		   exe41Cylinder c1 = new exe41Cylinder();
		      System.out.println("Cylinder:"
		            + " radius=" + c1.getRadius()
		            + " height=" + c1.getHeight()
		            + " base area=" + c1.getArea()
		            + " volume=" + c1.getVolume());
		   
		      // Declare and allocate a new instance of cylinder
		      //   specifying height, with default color and radius
		      exe41Cylinder c2 = new exe41Cylinder(10.0);
		      System.out.println("Cylinder:"
		            + " radius=" + c2.getRadius()
		            + " height=" + c2.getHeight()
		            + " base area=" + c2.getArea()
		            + " volume=" + c2.getVolume());
		   
		      // Declare and allocate a new instance of cylinder
		      //   specifying radius and height, with default color
		      exe41Cylinder c3 = new exe41Cylinder(2.0, 10.0);
		      System.out.println("Cylinder:"
		            + " radius=" + c3.getRadius()
		            + " height=" + c3.getHeight()
		            + " base area=" + c3.getArea()
		            + " volume=" + c3.getVolume());
	}
}
