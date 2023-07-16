import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.Queue;

public class ssj {
    static int countMistakes = 0;
    static Queue<Character> misLetters = new LinkedList<>();

    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        try {
            boolean areEqual = compareFiles(file1, file2);
            System.out.println(countMistakes);

            System.out.println("Files are equal: " + areEqual);
        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }

    public static boolean compareFiles(File file1, File file2) throws IOException {
        boolean follower = true;
        misLetters.add('a');
        
        byte[] file1Content = Files.readAllBytes(file1.toPath());
        byte[] file2Content = Files.readAllBytes(file2.toPath());

        if (file1Content.length != file2Content.length)
            return false;

        for (int i = 0; i < file1Content.length; i++) {
            if (file1Content.length > file2Content.length){
                if (file1Content[i] != file2Content[i]){
                    misLetters.add((char) file1Content[i]);
                    follower = false;
                    countMistakes++;
                }  
            }
            else{

            }
        }
        misLetters.remove();
        return follower;
    }
}
