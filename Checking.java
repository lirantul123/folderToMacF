import java.io.*;

public class Checking {   
    public static void main(String[] args) throws IOException {   
        BufferedReader reader1 = new BufferedReader(new FileReader("C:\\words.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("C:\\words00.txt"));
         
        String line1 = reader1.readLine();
        String line2 = reader2.readLine();
         
        boolean areEqual = true;
        int lineNum = 1;
         
        while (line1 != null || line2 != null) {

            if(line1 == null || line2 == null) {
                areEqual = false;
                break;
            }
            else if(!line1.equalsIgnoreCase(line2)) {
                areEqual = false;
                break;
            }
             
            line1 = reader1.readLine();
            line2 = reader2.readLine();
            lineNum++;
        }
         
        if(areEqual)
            System.out.println("They are the same!");

        else
            System.out.printf("File1 has '%s' and File2 has '%s' at line _%d_.", line1, line2, lineNum);
         
        reader1.close();
        reader2.close();
    }
}