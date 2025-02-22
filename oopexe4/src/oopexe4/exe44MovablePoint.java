package oopexe4;

public class exe44MovablePoint extends exe44Point {
	private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public exe44MovablePoint() {}

    public exe44MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public exe44MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() { return xSpeed; }
    public void setXSpeed(float xSpeed) { this.xSpeed = xSpeed; }

    public float getYSpeed() { return ySpeed; }
    public void setYSpeed(float ySpeed) { this.ySpeed = ySpeed; }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    public exe44MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
    public static void main(String[] args) {
        // Kiểm thử Point
        exe44Point p = new exe44Point(2.0f, 3.0f);
        System.out.println("Point: " + p);

        // Kiểm thử MovablePoint
        exe44MovablePoint mp = new exe44MovablePoint(2.0f, 3.0f, 1.5f, 2.5f);
        System.out.println("Before move: " + mp);
        mp.move();
        System.out.println("After move: " + mp);
    }
}
