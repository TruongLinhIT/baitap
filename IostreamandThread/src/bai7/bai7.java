package bai7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class bai7 extends Thread{
	private String filePath;

    public bai7(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (FileWriter writer = new FileWriter(filePath, true); Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhập dữ liệu (gõ 'exit' để thoát):");
            while (true) {
                String input = scanner.nextLine();
                if ("exit".equalsIgnoreCase(input)) break;
                writer.write(input + "\n");
                writer.flush(); // Đảm bảo dữ liệu được ghi ngay
            }
            System.out.println("Dữ liệu đã được ghi vào file: " + filePath);
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        String filePath = "bai7.txt";
        Thread writerThread = new bai7(filePath);
        writerThread.start();
    }

}
