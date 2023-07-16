import java.util.Scanner;
public class math {
    public static Scanner reader = new Scanner(System.in);
    public static void again() {

        System.out.print("Enter two numbers: ");
        double first = reader.nextDouble();
        double second = reader.nextDouble();
        System.out.print("Enter an operator (+, -, *, /, s): ");
        char operator = reader.next().charAt(0);
        System.out.println();
        double result1;
        double result2;

        if (operator == '+'){
            result1 = first + second;
            System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result1);
            System.out.println();

        }
        if (operator == '-'){
            result1 = first - second;
            System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result1);
            System.out.println();

        }
        if (operator == '*'){
            result1 = first * second;
            System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result1);
            System.out.println();

        }
        if (operator == '/'){
            result1 = first/ second;
            System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result1);
            System.out.println();

        }
        if (operator == 's' || operator == 'S'){
            result1 = Math.sqrt(first);
            result2 = Math.sqrt(second);
            System.out.printf("%c %.1f = %.1f", operator, first, result1);
            System.out.println();
            System.out.printf("%c %.1f = %.1f", operator, second, result2);
            System.out.println();

        }
    }
    public static void main(String[] args){
        again();
    }
}