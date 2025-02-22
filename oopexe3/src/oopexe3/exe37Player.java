package oopexe3;

public class exe37Player {
	private int number; // Số áo của cầu thủ
    private float x, y; // Vị trí của cầu thủ trên sân
    private float z = 0.0f; // Độ cao ban đầu (mặc định 0)

    public exe37Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    // Di chuyển cầu thủ trên mặt phẳng (x, y)
    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    // Nhảy lên theo trục z
    public void jump(float zDisp) {
        this.z += zDisp;
    }

    // Kiểm tra cầu thủ có gần bóng không (Khoảng cách < 8)
    public boolean near(exe37Ball ball) {
        float distance = (float) Math.sqrt(Math.pow(ball.getX() - x, 2) + Math.pow(ball.getY() - y, 2));
        return distance < 8;
    }

    // Đá bóng: nếu gần bóng, di chuyển bóng đến vị trí mới
    public void kick(exe37Ball ball) {
        if (near(ball)) {
            float newX = x + (float) (Math.random() * 10 - 5);
            float newY = y + (float) (Math.random() * 10 - 5);
            ball.setXYZ(newX, newY, 0);
            System.out.println("Player " + number + " kicked the ball to " + ball);
        } else {
            System.out.println("Player " + number + " is too far to kick the ball.");
        }
    }

    @Override
    public String toString() {
        return "Player " + number + " at (" + x + ", " + y + ", " + z + ")";
    }
    public static void main(String[] args) {
    	
            // Khởi tạo bóng
    		exe37Ball ball = new exe37Ball(50, 50, 0);
            System.out.println("Initial Ball Position: " + ball);

            // Khởi tạo cầu thủ
            exe37Player player1 = new exe37Player(7, 45, 48);
            exe37Player player2 = new exe37Player(10, 20, 30);

            System.out.println(player1);
            System.out.println(player2);

            // Kiểm tra cầu thủ có gần bóng không và thử đá bóng
            System.out.println("Player 1 near ball? " + player1.near(ball));
            player1.kick(ball);

            System.out.println("Player 2 near ball? " + player2.near(ball));
            player2.kick(ball);

            // Di chuyển cầu thủ và thử lại
            player2.move(30, 20);
            System.out.println("After moving, " + player2);
            System.out.println("Player 2 near ball? " + player2.near(ball));
            player2.kick(ball);
	}
}
