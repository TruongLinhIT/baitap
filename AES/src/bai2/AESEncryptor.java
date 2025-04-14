package bai2;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class AESEncryptor implements Encryptable {

	 private static final String ALGORITHM = "AES/ECB/PKCS5Padding";
	    private static final String KEY = "1234567890abcdef"; // 16 ký tự = 128-bit
	    private final SecretKeySpec secretKey;

	    public AESEncryptor() {
	        this.secretKey = new SecretKeySpec(KEY.getBytes(), "AES");
	    }

	    @Override
	    public String encrypt(String plainText) throws Exception {
	        Cipher cipher = Cipher.getInstance(ALGORITHM);
	        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
	        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes("UTF-8"));
	        return Base64.getEncoder().encodeToString(encryptedBytes);
	    }

	    @Override
	    public String decrypt(String encryptedText) throws Exception {
	        Cipher cipher = Cipher.getInstance(ALGORITHM);
	        cipher.init(Cipher.DECRYPT_MODE, secretKey);
	        byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
	        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
	        return new String(decryptedBytes, "UTF-8");
	    }

}
