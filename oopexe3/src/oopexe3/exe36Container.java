package oopexe3;

public class exe36Container {
	private int x1, y1, x2, y2; // Tọa độ góc trên trái (x1, y1) và góc dưới phải (x2, y2)

    public exe36Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width - 1;
        this.y2 = y + height - 1;
    }

    // Getter methods
    public int getX1() { return x1; }
    public int getY1() { return y1; }
    public int getX2() { return x2; }
    public int getY2() { return y2; }

    // Kiểm tra bóng có chạm biên không và xử lý phản xạ
    public boolean collidesWith(exe36Ball ball) {
        boolean collision = false;

        // Kiểm tra va chạm với tường dọc
        if (ball.getX() - ball.getRadius() <= x1 || ball.getX() + ball.getRadius() >= x2) {
            ball.reflectHorizontal();
            collision = true;
        }

        // Kiểm tra va chạm với tường ngang
        if (ball.getY() - ball.getRadius() <= y1 || ball.getY() + ball.getRadius() >= y2) {
            ball.reflectVertical();
            collision = true;
        }

        return collision;
    }

    @Override
    public String toString() {
        return "Container [(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")]";
    }
    public static void main(String[] args) {
    	exe36Ball ball = new exe36Ball(50, 50, 5, 10, 30);
    	exe36Container box = new exe36Container(0, 0, 100, 100);
    	for (int step = 0; step < 100; ++step) {
    	   ball.move();
    	   box.collidesWith(ball);
    	   System.out.println(ball); // manual check the position of the ball
	}
    }
}
