import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class screen {
    public static void main(String[] args) throws InterruptedException{		
        Scanner in = new Scanner(System.in);
        Random trying = new Random();

        int count = 3;
        while(count >= 0){

            System.out.print("Guess a boolean: ");
            boolean select = in.nextBoolean();

            boolean random = trying.nextBoolean();

            if (select == random){
                Thread.sleep(2000);
                System.out.printf("You right! it's really (%b) ", random);
                break;
            }
            else{
                System.out.println("Try again");
                count--;
                if (count == 0){
                    System.out.println("YOU DONT HAVE ANYMORE CHANCES");
                    break;
                }
            }
            
        }          
    }
}