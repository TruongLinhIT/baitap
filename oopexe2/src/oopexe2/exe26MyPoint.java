package oopexe2;

public class exe26MyPoint {
	private int x = 0;
    private int y = 0;

    // Constructors
    public exe26MyPoint() {
    }

    public exe26MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // Distance calculations
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(exe26MyPoint another) {
        return distance(another.x, another.y);
    }

    public double distance() {
        return distance(0, 0);
    }
    public static void main(String[] args) {
    	exe26MyPoint p1 = new exe26MyPoint();  // Test constructor
    	System.out.println(p1);      // Test toString()
    	p1.setX(8);   // Test setters
    	p1.setY(6);
    	System.out.println("x is: " + p1.getX());  // Test getters
    	System.out.println("y is: " + p1.getY());
    	p1.setXY(3, 0);   // Test setXY()
    	System.out.println(p1.getXY()[0]);  // Test getXY()
    	System.out.println(p1.getXY()[1]);
    	System.out.println(p1);

    	exe26MyPoint p2 = new exe26MyPoint(0, 4);  // Test another constructor
    	System.out.println(p2);
    	// Testing the overloaded methods distance()
    	System.out.println(p1.distance(p2));    // which version?
    	System.out.println(p2.distance(p1));    // which version?
    	System.out.println(p1.distance(5, 6));  // which version?
    	System.out.println(p1.distance());      // which version?
	}
}
