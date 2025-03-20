package bai5;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class bai5 extends Thread {
	private String logFile;
    private String message;

    public bai5(String logFile, String message) {
        this.logFile = logFile;
        this.message = message;
    }

    @Override
    public void run() {
        try (FileWriter writer = new FileWriter(logFile, true)) {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            writer.write(timestamp + " - " + message + "\n");
            System.out.println("Đã ghi log: " + timestamp + " - " + message);
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi log: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        String logFile = "bai5.txt";
        
        Thread log1 = new bai5(logFile, "Hệ thống khởi động");
        Thread log2 = new bai5(logFile, "Người dùng đăng nhập");
        
        log1.start();
        log2.start();
    }
    
}


