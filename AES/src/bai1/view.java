package bai1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class view extends JFrame {
	// Giả lập database
    static String usernameDB = "admin";
    static String passwordHashDB = BAI1.hashWithSHA256("123456"); // Đã mã hóa sẵn

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view frame = new view();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Đăng Nhập");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(304, 38, 141, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblUsername.setBounds(92, 106, 141, 44);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPassword.setBounds(92, 183, 141, 44);
		contentPane.add(lblPassword);
		
		txtUser = new JTextField();
		txtUser.setBounds(242, 113, 274, 38);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setColumns(10);
		txtPass.setBounds(242, 189, 274, 38);
		contentPane.add(txtPass);
		
		JButton btnDangNhap = new JButton("Đăng Nhập");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtUser.getText().isEmpty() || txtPass.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "khong duoc de trong thong tin");
				}else {
					String hashedInputPassword = BAI1.hashWithSHA256(txtPass.getText());

		            if (txtUser.getText().equals(usernameDB) && hashedInputPassword.equals(passwordHashDB)) {
		                System.out.println("✅ Đăng nhập thành công!");
		                JOptionPane.showMessageDialog(null, "Dang nhap thanh cong");
		            } else {
		                System.out.println("❌ Sai username hoặc password!");
		                JOptionPane.showMessageDialog(null, "tai khoan hoac mat khau bi sai");
		            }
				}
			}
		});
		btnDangNhap.setBounds(304, 278, 122, 38);
		contentPane.add(btnDangNhap);
	}
}
