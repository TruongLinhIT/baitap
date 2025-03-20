package bai3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bai3 extends Thread {
	private String sourceFile;
    private String destinationFile;

    public bai3(String sourceFile, String destinationFile) {
        this.sourceFile = sourceFile;
        this.destinationFile = destinationFile;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Xuống dòng
            }
            
            System.out.println("Sao chép hoàn tất từ " + sourceFile + " đến " + destinationFile);
        } catch (IOException e) {
            System.err.println("Lỗi khi sao chép file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        String sourceFile = "bai1.txt";
        String destinationFile = "bai2.txt";
        
        bai3 copyThread = new bai3(sourceFile, destinationFile);
        copyThread.start();
    }

}
