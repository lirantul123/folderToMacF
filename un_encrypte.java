import java.util.Scanner;

public class un_encrypte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the encrypted message: ");
        String encryptedMessage = scanner.nextLine();

        String decryptedMessage = decryptMessage(encryptedMessage);
        System.out.println("Decrypted message: " + decryptedMessage);
    }

    public static String decryptMessage(String encryptedMessage) {
        StringBuilder decrypted = new StringBuilder();
        int wordCount = 1;

        for (int i = 0; i < encryptedMessage.length(); i++) {
            char ch = encryptedMessage.charAt(i);

            // Increment the decryption key for each word
            if (Character.isWhitespace(ch)) {
                wordCount++;
            }

            int key = wordCount % 26;

            // Decrypt uppercase letters
            if (Character.isUpperCase(ch)) {
                char decryptedChar = (char) ((ch - 'A' - key + 26) % 26 + 'A');
                decrypted.append(decryptedChar);
            }
            // Decrypt lowercase letters
            else if (Character.isLowerCase(ch)) {
                char decryptedChar = (char) ((ch - 'a' - key + 26) % 26 + 'a');
                decrypted.append(decryptedChar);
            }
            // Leave non-alphabetic characters unchanged
            else {
                decrypted.append(ch);
            }
        }

        return decrypted.toString();
    }
}
