import java.util.*;

public class h16 {
    static final String PASSWORD = "999999";
    static boolean passwordFound = false;

    public static void main(String[] args) {
        int[] code = new int[6]; // Array to store the 6-digit code
        
        // Iterate over all possible combinations of the code
        for (int d1 = 0; d1 <= 9; d1++) {
            for (int d2 = 0; d2 <= 9; d2++) {
                for (int d3 = 0; d3 <= 9; d3++) {
                    for (int d4 = 0; d4 <= 9; d4++) {
                        for (int d5 = 0; d5 <= 9; d5++) {
                            for (int d6 = 0; d6 <= 9; d6++) {
                                code[0] = d1;
                                code[1] = d2;
                                code[2] = d3;
                                code[3] = d4;
                                code[4] = d5;
                                code[5] = d6;
                                
                                for (int i = 0; i < 6; i++){
                                    System.out.print(code[i]);
                                }
                                if (checkPassword(code)){
                                    passwordFound = true;
                                    System.out.print("\nPassword found " + PASSWORD);
                                    break;

                                }
                                System.out.println(); 

                                }if (passwordFound) 
                                    break;
                        }
                        if (passwordFound) 
                            break;      
                    }
                    if (passwordFound) 
                        break;
                }
                if (passwordFound) 
                    break;
            }
            if (passwordFound) 
                break;
        }
        
        if (!passwordFound) 
            System.out.println("No password found.");
    
    }

    public static boolean checkPassword(int[] code) {
        StringBuilder builder = new StringBuilder();
        for (int digit : code) {
            builder.append(digit);
        }
        String codeString = builder.toString();
        return codeString.equals(PASSWORD);
    }
}
