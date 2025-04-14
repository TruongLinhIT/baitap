package bai1;

import java.security.MessageDigest;
import java.util.Scanner;

public class BAI1 {
	public static String hashWithSHA256(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();

        } catch (Exception e) {
            throw new RuntimeException("Lỗi khi băm mật khẩu: " + e.getMessage());
        }
	}
     
}
