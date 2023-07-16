import java.util.*;

public class AcheckSome{
    public static void main(String[] args){
        Random s = new  Random();

        int diller=0, dillsum=0;
        int you=0, yousum=0;

        for (int i=0; i<2; i++) {            
            diller = 1 + (int)(Math.random()*(10-1+1));

            dillsum+=diller;
            
            System.out.println("First numD: " + diller);
        }
        System.out.println("Diller hand:  " + dillsum);

        for (int i=0; i<2; i++) {            
            you = 1 + (int)(Math.random()*(10-1+1));

            yousum+=diller;

            System.out.println("First numY: " + diller);
        }
        System.out.println("Yours hand:  " + yousum);

    }
}