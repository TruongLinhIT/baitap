package oopexe2;

public class exe28MyCircle {
	private exe26MyPoint center;
    private int radius;

    // Constructors
    public exe28MyCircle() {
        this.center = new exe26MyPoint(0, 0);
        this.radius = 1;
    }

    public exe28MyCircle(int x, int y, int radius) {
        this.center = new exe26MyPoint(x, y);
        this.radius = radius;
    }

    public exe28MyCircle(exe26MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // Getters and Setters
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public exe26MyPoint getCenter() {
        return center;
    }

    public void setCenter(exe26MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int[] getCenterXY() {
        return center.getXY();
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    // Calculate Area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Calculate Circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Calculate Distance between two circles (distance between centers)
    public double distance(exe28MyCircle another) {
        return center.distance(another.getCenter());
    }

    @Override
    public String toString() {
        return "MyCircle[radius=" + radius + ", center=" + center + "]";
    }
    public static void main(String[] args) {
    	exe28MyCircle c1 = new exe28MyCircle();
    	exe28MyCircle c2 = new exe28MyCircle(3, 4, 5);
    	exe28MyCircle c3 = new exe28MyCircle(new exe26MyPoint(6, 8), 10);

        // Kiểm tra toString()
        System.out.println("Circle 1: " + c1);
        System.out.println("Circle 2: " + c2);
        System.out.println("Circle 3: " + c3);

        // Kiểm tra getters
        System.out.println("Circle 2 center: " + c2.getCenter());
        System.out.println("Circle 2 radius: " + c2.getRadius());

        // Kiểm tra setters
        c1.setCenterXY(2, 3);
        c1.setRadius(7);
        System.out.println("Circle 1 after modification: " + c1);

        // Kiểm tra diện tích và chu vi
        System.out.println("Circle 2 area: " + c2.getArea());
        System.out.println("Circle 2 circumference: " + c2.getCircumference());

        // Kiểm tra khoảng cách giữa hai hình tròn
        System.out.println("Distance between Circle 1 and Circle 2: " + c1.distance(c2));
    
	}
}
