import java.util.*;

public class shorashem {
    public static void main(String[] args){
        Scanner fe = new Scanner(System.in);
        System.out.print("DO you want from me to show the way? " );
        String x = fe.next();

        switch(x){
            case "yes":
                System.out.print("Enter a: ");
                int a = fe.nextInt();
                System.out.print("Enter b: ");
                int b = fe.nextInt();
                System.out.print("Enter c: ");
                int c = fe.nextInt();
                System.out.println();
        
                System.out.printf("X1,2= %d +- V(%d*%d-4*%d*%d)/2*%d\n", -b, b, b, a, c, a);
                System.out.printf("X1,2= %d +- V(%d +(%d))/%d\n", -b, b*b, -4*a*c, a*2 );
                System.out.printf("X1,2= %d +- V(%d)/%d\n", -b, b*b -4*a*c, a*2 );
                System.out.printf("X1,2= %d +- %g/%d\n", -b, Math.sqrt( b*b -4*a*c ), a*2 );
        
                System.out.println();
                System.out.printf( "x1= %f\nx2= %f\n",
                (-(b)+(Math.sqrt( b*b-4*a*c )))/(2*a),
                (-(b)-(Math.sqrt( b*b-4*a*c )))/(2*a) );
                break;
                
            
            case "no":
                System.out.print("Enter a: ");
                int d = fe.nextInt();
                System.out.print("Enter b: ");
                int e = fe.nextInt();
                System.out.print("Enter c: ");
                int f = fe.nextInt();
                System.out.println();
                System.out.println("!!!");

                System.out.println("x1=" + (-(e)+(Math.sqrt( e*e-4*d*f )))/(2*d));
                System.out.println("x2=" + (-(e)-(Math.sqrt( e*e-4*d*f )))/(2*d));
                System.out.println("!!!");

                break;

                default:
                    System.out.println("I dont understad.");
        }

    }

}
