import java.util.Scanner;

public class encrypte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the message to encrypt: ");
        String message = scanner.nextLine();

        String encryptedMessage = encryptMessage(message);
        System.out.println("Encrypted message: " + encryptedMessage);
    }

    public static String encryptMessage(String message) {
        StringBuilder encrypted = new StringBuilder();
        int wordCount = 1;

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            // Increment the encryption key for each word
            if (Character.isWhitespace(ch)) {
                wordCount++;
            }

            int key = wordCount % 26;

            // Encrypt uppercase letters
            if (Character.isUpperCase(ch)) {
                char encryptedChar = (char) ((ch - 'A' + key) % 26 + 'A');
                encrypted.append(encryptedChar);
            }
            // Encrypt lowercase letters
            else if (Character.isLowerCase(ch)) {
                char encryptedChar = (char) ((ch - 'a' + key) % 26 + 'a');
                encrypted.append(encryptedChar);
            }
            // Leave non-alphabetic characters unchanged
            else {
                encrypted.append(ch);
            }
        }

        return encrypted.toString();
    }
}
