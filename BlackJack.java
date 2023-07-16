import java.util.*;

public class BlackJack {
    public static Scanner in = new Scanner(System.in);


    //public static void numbers(){
//
  //  }

    public static String checkingif(int dillsum1, int yousum1){
        if (dillsum1>21 && yousum1>21)
            return "No one has won!";
        else if (dillsum1>21 && yousum1<=21)
            return "You have won!";
        else if (dillsum1<=21 && yousum1>21) 
            return "Diller has won!";  
        else
            return "continue...";     
    }
    
    // פונקציית לבדיקת *split* 
    public static void split(int you, int you1){
        if (you == you1) 
            System.out.print("Do you want a split: ");
            String split = in.next();
        if (split.equals("yes") || split.equals("YES")) 
            System.out.println(); 
    } 

    // *פונקצייה *שמגרילה מספר רנדומלי בטווח 1-11
    public static int numbers(){
        int result = 1 + (int)(Math.random()*(11-1+1));
        return result; 
    }

    // *פונקציית בדיקה של *המנצח, להיפך ותיקו
    public static boolean checkingif2(int dillsum1, int yousum1) {
        while (dillsum1>0 && yousum1>0){ 
            if (dillsum1>21 && yousum1>21){
                System.out.println("Tie");
                return false; 
            } else if (dillsum1>21 && yousum1<=21){ 
                System.out.println("You have won");
                return false;
            } else if (dillsum1<=21 && yousum1>21) {
                System.out.println("The diller has won");
                return false; 
            } else{ 
                return true;
            } 
        } 
        return false; 
    } 
    // משתנים שמשומשים     
    static int diller=0, diller1=0, diller2=0, dillsum=0, dillsum1=0;
    static int dillsum2=0, diller3=0, count2=0;
    static int you=0, you1=0, you2=0, yousum=0, yousum1=0;
    static int yousum2=0, you3=0, count3=0; 
    static int count=0, count1=0;
    static char getcard;

    // פונקצייה
    public static void yes() {
        diller = numbers();
        diller1 = numbers();
        dillsum=diller;
        you = numbers();
        you1 = numbers();
        yousum=you+you1; 

        System.out.printf("Diller's hand: _%d_ _|_(+%d...);\n", diller, dillsum);
        System.out.printf("Your hand: _%d_ _%d_(+%d);\n\n", you, you1, yousum);
        dillsum=diller+diller1;



        diller2 = 1 + (int)(Math.random()*(11-1+1));
        you2 = 1 + (int)(Math.random()*(11-1+1));


        diller2 = numbers(); 
        you2 = numbers();

        System.out.println("Card? (write 'stop(s)' if you want to stop)");
        String getcard=in.next();
        while(!(getcard.equals("s"))){
            System.out.printf("Diller's hand: _%d_ _%d_ _%d_(+%d);\n", diller, diller1, diller2, dillsum+diller2);
            System.out.printf("Your hand: _%d_ _%d_ _%d_(+%d);\n", you, you1, you2, yousum+you2);
            dillsum1 = dillsum+diller2;
            yousum1 = yousum+you2;

            System.out.println(checkingif(dillsum1,yousum1));

            System.out.println("Card? ");
            getcard=in.next();
        }
    }
    

    // פונקצייה
    public static void second1(){
        another();
        while(!(getcard=='s')){
            System.out.printf("Diller's hand: (+%d);\n", count);
            System.out.printf("Your hand: (+%d);\n\n", count1);
                    
            checkingif(dillsum1,yousum1);

            diller3 = numbers(); 
            you3 = numbers();

            System.out.print("Card? ");
            getcard=in.next().charAt(0);

        }     

    }

    // פונקצייה
    public static void another(){
        int dillernext = numbers();
        int younext = numbers();

        count2+=dillernext+count;
        count3+=younext+count1;

    }
    
    // פונקצייה
    public static void second(){
        while(checkingif2(dillsum1, yousum1)){
            System.out.println("Card? (write 'stop(s)' if you want to stop)");
            getcard=in.next().charAt(0);
            diller3 = numbers();
            you3 = numbers(); 
            int count = diller+diller1+diller2+diller3;
            int count1 = you+you1+you2+you3;

            while(!(getcard=='s')){
                System.out.printf("Diller's hand: _%d_ _%d_ _%d_ _%d_(+%d);\n", diller, diller1, diller2, diller3, count);
                System.out.printf("Your hand: _%d_ _%d_ _%d_ _%d_(+%d);\n\n", you, you1, you2, you3, count1);
                        
                if (checkingif2(dillsum1,yousum1));
                    second1();

                diller3 = numbers(); 
                you3 = numbers();

                System.out.print("Card? ");
                getcard=in.next().charAt(0);

            }     
        }
    } 
    // פונקצייה ראשית
    public static void main(String[] args)  { 
        yes(); 
    } 
}
