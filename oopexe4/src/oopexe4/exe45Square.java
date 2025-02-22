package oopexe4;

public class exe45Square extends exe45Rectangle {
	public exe45Square() {}

    public exe45Square(double side) {
        super(side, side);
    }

    public exe45Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() { return getWidth(); }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
    public static void main(String[] args) {
        // Kiểm thử Shape
        exe45Shape s1 = new exe45Shape("blue", false);
        System.out.println(s1);

        // Kiểm thử Circle
        exe45Circle c1 = new exe45Circle(2.5, "yellow", true);
        System.out.println(c1);
        System.out.println("Circle Area: " + c1.getArea());
        System.out.println("Circle Perimeter: " + c1.getPerimeter());

        // Kiểm thử Rectangle
        exe45Rectangle r1 = new exe45Rectangle(4.0, 5.0, "green", false);
        System.out.println(r1);
        System.out.println("Rectangle Area: " + r1.getArea());
        System.out.println("Rectangle Perimeter: " + r1.getPerimeter());

        // Kiểm thử Square
        exe45Square sq1 = new exe45Square(3.0, "purple", true);
        System.out.println(sq1);
        System.out.println("Square Area: " + sq1.getArea());
        System.out.println("Square Perimeter: " + sq1.getPerimeter());
    }
}
