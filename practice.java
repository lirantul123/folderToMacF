import java.util.Scanner;

public class practice {
    
    public static int yes(double num)
    {
        return (int) Math.round(num);
    }
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        
        System.out.println(yes(5.5));
        System.out.println(yes(3.6));
        System.out.println(yes(7.3));
    }
}
