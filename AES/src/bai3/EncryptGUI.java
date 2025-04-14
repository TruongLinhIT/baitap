package bai3;

import javax.swing.*;
import java.awt.*;

public class EncryptGUI extends JFrame {
	private JTextArea inputArea, encryptedArea, decryptedArea;
    private JButton runButton;

    public EncryptGUI() {
        setTitle("Mã hóa & Giải mã đồng thời (đa luồng)");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        inputArea = new JTextArea(5, 60);
        encryptedArea = new JTextArea(5, 60);
        decryptedArea = new JTextArea(5, 60);

        encryptedArea.setEditable(false);
        decryptedArea.setEditable(false);

        JScrollPane inputScroll = new JScrollPane(inputArea);
        JScrollPane encryptedScroll = new JScrollPane(encryptedArea);
        JScrollPane decryptedScroll = new JScrollPane(decryptedArea);

        inputScroll.setBorder(BorderFactory.createTitledBorder("Văn bản gốc"));
        encryptedScroll.setBorder(BorderFactory.createTitledBorder("Kết quả mã hóa (AES)"));
        decryptedScroll.setBorder(BorderFactory.createTitledBorder("Kết quả giải mã"));

        runButton = new JButton("Thực hiện (Đa luồng)");

        add(inputScroll, BorderLayout.NORTH);
        add(encryptedScroll, BorderLayout.CENTER);
        add(decryptedScroll, BorderLayout.SOUTH);
        add(runButton, BorderLayout.PAGE_END);

        runButton.addActionListener(e -> runEncryptionThreads());

        setVisible(true);
    }

    private void runEncryptionThreads() {
        String originalText = inputArea.getText();
        encryptedArea.setText("");
        decryptedArea.setText("");

        Encryptable encryptor = new AESEncryptor();

        // Luồng mã hóa
        Thread encryptThread = new Thread(() -> {
            try {
                String encrypted = encryptor.encrypt(originalText);
                SwingUtilities.invokeLater(() -> encryptedArea.setText(encrypted));
            } catch (Exception ex) {
                SwingUtilities.invokeLater(() -> encryptedArea.setText("Lỗi mã hóa: " + ex.getMessage()));
            }
        });

        // Luồng giải mã
        Thread decryptThread = new Thread(() -> {
            try {
                // Đợi luồng mã hóa hoàn thành trước khi giải mã
                encryptThread.join();
                String encryptedText = encryptedArea.getText();
                String decrypted = encryptor.decrypt(encryptedText);
                SwingUtilities.invokeLater(() -> decryptedArea.setText(decrypted));
            } catch (Exception ex) {
                SwingUtilities.invokeLater(() -> decryptedArea.setText("Lỗi giải mã: " + ex.getMessage()));
            }
        });

        encryptThread.start();
        decryptThread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EncryptGUI());
    }
}
