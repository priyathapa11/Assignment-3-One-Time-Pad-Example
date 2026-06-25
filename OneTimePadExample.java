import java.security.SecureRandom;
import java.util.Base64;

public class OneTimePadExample {

    public static byte[] generateKey(int length) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] key = new byte[length];
        secureRandom.nextBytes(key);
        return key;
    }

    public static byte[] encrypt(byte[] plaintext, byte[] key) {
        byte[] ciphertext = new byte[plaintext.length];

        for (int i = 0; i < plaintext.length; i++) {
            ciphertext[i] = (byte) (plaintext[i] ^ key[i]);
        }

        return ciphertext;
    }

    public static byte[] decrypt(byte[] ciphertext, byte[] key) {
        byte[] decryptedText = new byte[ciphertext.length];

        for (int i = 0; i < ciphertext.length; i++) {
            decryptedText[i] = (byte) (ciphertext[i] ^ key[i]);
        }

        return decryptedText;
    }

    public static void main(String[] args) {
        String message = "MY NAME IS UNKNOWN";

        byte[] plaintext = message.getBytes();
        byte[] key = generateKey(plaintext.length);
        byte[] encrypted = encrypt(plaintext, key);
        byte[] decrypted = decrypt(encrypted, key);

        System.out.println("Original Text: " + message);
        System.out.println("Generated Key: " + Base64.getEncoder().encodeToString(key));
        System.out.println("Encrypted Text: " + Base64.getEncoder().encodeToString(encrypted));
        System.out.println("Decrypted Text: " + new String(decrypted));
    }
}
