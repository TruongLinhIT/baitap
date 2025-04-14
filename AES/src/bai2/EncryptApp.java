package bai2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class EncryptApp extends JFrame {
	private JTextArea inputArea, outputArea;
    private JComboBox<String> algorithmBox;
    private JButton encryptBtn, decryptBtn;

    private Encryptable encryptor;

    public EncryptApp() {
        setTitle("Mã hóa AES/RSA");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Khu vực nhập và xuất
        inputArea = new JTextArea(5, 40);
        outputArea = new JTextArea(5, 40);
        outputArea.setEditable(false);

        // Chọn thuật toán
        algorithmBox = new JComboBox<>(new String[]{"AES", "RSA"});

        encryptBtn = new JButton("Encrypt");
        decryptBtn = new JButton("Decrypt");

        // Panel phía trên
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Thuật toán:"));
        topPanel.add(algorithmBox);
        topPanel.add(encryptBtn);
        topPanel.add(decryptBtn);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(inputArea), BorderLayout.CENTER);
        add(new JScrollPane(outputArea), BorderLayout.SOUTH);

        // Hành động
        encryptBtn.addActionListener((ActionEvent e) -> {
            try {
                prepareEncryptor();
                String text = inputArea.getText();
                String encrypted = encryptor.encrypt(text);
                outputArea.setText(encrypted);
            } catch (Exception ex) {
                outputArea.setText("Lỗi mã hóa: " + ex.getMessage());
            }
        });

        decryptBtn.addActionListener((ActionEvent e) -> {
            try {
                prepareEncryptor();
                String text = inputArea.getText();
                String decrypted = encryptor.decrypt(text);
                outputArea.setText(decrypted);
            } catch (Exception ex) {
                outputArea.setText("Lỗi giải mã: " + ex.getMessage());
            }
        });

        setVisible(true);
    }

    private void prepareEncryptor() throws Exception {
        String selected = (String) algorithmBox.getSelectedItem();
        if (selected.equals("AES")) {
            encryptor = new AESEncryptor();
        } else if (selected.equals("RSA")) {
            encryptor = new RSAEncryptor();
        }
    }

    public static void main(String[] args) {
        new EncryptApp();
    }
}
