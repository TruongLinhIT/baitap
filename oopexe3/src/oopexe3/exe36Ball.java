package oopexe3;

public class exe36Ball {
	private float x, y;          // Tọa độ trung tâm
    private int radius;          // Bán kính
    private float dx, dy;        // Thành phần vận tốc theo trục x, y

    public exe36Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        double radians = Math.toRadians(direction);
        this.dx = (float) (speed * Math.cos(radians));
        this.dy = (float) (-speed * Math.sin(radians)); // Y đảo chiều do hệ tọa độ đồ họa
    }

    // Getter methods
    public float getX() { return x; }
    public float getY() { return y; }
    public int getRadius() { return radius; }
    public float getDx() { return dx; }
    public float getDy() { return dy; }

    // Setter methods
    public void setX(float x) { this.x = x; }
    public void setY(float y) { this.y = y; }
    public void setRadius(int radius) { this.radius = radius; }
    public void setDx(float dx) { this.dx = dx; }
    public void setDy(float dy) { this.dy = dy; }

    // Di chuyển bóng một bước
    public void move() {
        x += dx;
        y += dy;
    }

    // Phản xạ khi chạm tường dọc
    public void reflectHorizontal() {
        dx = -dx;
    }

    // Phản xạ khi chạm tường ngang
    public void reflectVertical() {
        dy = -dy;
    }

    @Override
    public String toString() {
        return "Ball at (" + x + ", " + y + "), speed=(" + dx + ", " + dy + ")";
    }
}
