
public class hi {
    
    static char FILE1[] = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
    static char FILE2[] = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
    static char d;
    static char c;
    static int i=0;
    public static void main(String[] args) {

        if (FILE1==FILE2)
            System.out.println("GOOD");


        else if(!(FILE1.equals(FILE2)) || !(FILE2.equals(FILE1))){
            for (char num: FILE1) {
                i++;
            }

            for (int j=0; j<i; j++) {
                
                for (char file1: FILE1) {
                    file1=c;
                    for (char file2: FILE2) {
                        file2=d;
                    }

                }
                if (c == d)
                    System.out.println("Ok\n");
                    
                else
                    System.out.printf("The letter '%c' is not equal to the letter '%c'.\n", c, d);
            }    
            
        }
        else 
            System.out.println("No!");
    }
}