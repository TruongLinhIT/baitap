package exeopp6;

public class exe68MovableRectangle implements exe68Movable {
	private exe68MovablePoint topLeft;
    private exe68MovablePoint bottomRight;

    public exe68MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new exe68MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new exe68MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + '}';
    }
    public static void main(String[] args) {
        exe68MovablePoint p1 = new exe68MovablePoint(2, 3, 5, 5);
        System.out.println(p1);
        p1.moveUp();
        System.out.println("After moving up: " + p1);

        exe68MovableCircle c1 = new exe68MovableCircle(4, 5, 3, 3, 10);
        System.out.println(c1);
        c1.moveRight();
        System.out.println("After moving right: " + c1);

        exe68MovableRectangle r1 = new exe68MovableRectangle(1, 2, 3, 4, 2, 2);
        System.out.println(r1);
        r1.moveLeft();
        System.out.println("After moving left: " + r1);
    }
}
