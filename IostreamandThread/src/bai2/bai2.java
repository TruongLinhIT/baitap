package bai2;

import java.io.FileWriter;
import java.io.IOException;

public class bai2 extends Thread {
	private String filePath;
    private String message;
    private static final Object lock = new Object(); // Đối tượng khóa để đồng bộ hóa

    public bai2(String filePath, String message) {
        this.filePath = filePath;
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try (FileWriter writer = new FileWriter(filePath, true)) { // true để ghi tiếp
                writer.write(message + "\n");
                System.out.println(Thread.currentThread().getName() + " đã ghi: " + message);
            } catch (IOException e) {
                System.err.println("Lỗi khi ghi file: " + e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        String filePath = "bai2.txt";
        
        Thread thread1 = new bai2(filePath, "Xin chào từ Thread 1!");
        Thread thread2 = new bai2(filePath, "Hello from Thread 2!");
        
        thread1.start();
        thread2.start();
    }
}
