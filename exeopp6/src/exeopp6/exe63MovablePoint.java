package exeopp6;

public class exe63MovablePoint implements exe63Movable {
	int x, y;
    int xSpeed, ySpeed;

    public exe63MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
    }
    public static void main(String[] args) {
        exe63MovablePoint p1 = new exe63MovablePoint(5, 5, 2, 2);
        System.out.println(p1); // In trạng thái ban đầu
        
        p1.moveUp();
        System.out.println("After move up: " + p1);

        p1.moveLeft();
        System.out.println("After move left: " + p1);

        p1.moveDown();
        System.out.println("After move down: " + p1);

        p1.moveRight();
        System.out.println("After move right: " + p1);
    }
}
