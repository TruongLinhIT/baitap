package bai9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bai9 extends Thread {
	private String inputFile;
    private String outputFile;

    public bai9(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(outputFile)) {
            
            int charCount = 0;
            int c;
            while ((c = reader.read()) != -1) {
                charCount++;
            }
            
            writer.write("Số ký tự trong file: " + charCount + "\n");
            System.out.println("Kết quả đã được ghi vào " + outputFile);
        } catch (IOException e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        String inputFile = "bai5.txt";
        String outputFile = "char_count.txt";
        
        bai9 counterThread = new bai9(inputFile, outputFile);
        counterThread.start();
    }

}
