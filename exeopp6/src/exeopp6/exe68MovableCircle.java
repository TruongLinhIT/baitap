package exeopp6;

public class exe68MovableCircle implements exe68Movable {
	private int radius;
    private exe68MovablePoint center;

    public exe68MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new exe68MovablePoint(x, y, xSpeed, ySpeed);
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
        return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }

}
