package exeopp6;

public class exe65ResizableCircle extends exe65Circle implements exe65Resizable {
	// Constructor
    public exe65ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius *= percent / 100.0;
    }

    @Override
    public String toString() {
        return "ResizableCircle[Circle[radius=" + radius + "]]";
    }
    public static void main(String[] args) {
        exe65Circle c1 = new exe65Circle(10);
        System.out.println("Circle:");
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println(c1);

        exe65ResizableCircle c2 = new exe65ResizableCircle(10);
        System.out.println("\nResizableCircle before resizing:");
        System.out.println(c2);
        c2.resize(50);
        System.out.println("\nResizableCircle after resizing by 50%:");
        System.out.println(c2);
    }
}
