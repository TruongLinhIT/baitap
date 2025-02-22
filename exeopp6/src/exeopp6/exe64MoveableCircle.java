package exeopp6;

public class exe64MoveableCircle implements exe63Movable {
	private int radius;
    private exe63MovablePoint center;

    // Constructor
    public exe64MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new exe63MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return center.toString() + ", radius=" + radius;
    }

}
