package bai1;
import java.io.*;
public class bai1 extends Thread  {
	private String filePath;

    public bai1(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(Thread.currentThread().getName() + " đọc: " + line);
                Thread.sleep(500); // Tạo độ trễ để dễ quan sát
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }



    public static void main(String[] args) {
        String filePath = "C:\\Users\\ADmin\\Desktop\\javaproject\\IostreamandThread\\bai1.txt"; // Thay bằng đường dẫn file thực tế
        bai1 fileReaderThread = new bai1(filePath);
        fileReaderThread.start();
    }
}
