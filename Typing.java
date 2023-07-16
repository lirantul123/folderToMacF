import java.util.*;
// קלט: קולט מספר
// פלט: חישובם של סכום המספרים ומכפלתם
public class Typing{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int grade, maxGrade=0, litGrade=100, numberTest=2; 
        
        // מבקש מהמשתמש להכניס מספרים(התוצאות של המתכונים) וקולט אותו
        System.out.println("Enter test number 1: ");
        grade = in.nextInt();
        
        // לולאת while
        while (grade > -1){

            // בודק איזה ציון הוא הכי גבוה
            if (grade > maxGrade)
                maxGrade = grade;

            // בודק איזה ציון הוא נמוך
            if (grade < litGrade)
                litGrade = grade;

            // אם הציון הוא שווה או מעל ל 95 יחזיר הודעה למסך שהמבחן הועבר בהצלחה 
            if (grade >= 95){
                System.out.println("past successfully");
                System.out.println();
            }
            
            // אם הציון הוא מתחת ל 55 יחזיר הודעה למסך שהמבחן הוא נכשל 
            else if (grade < 55){
                System.out.println("failed");
                System.out.println();

            }
            // מבקש להכניס את תוצאת המבחן הבא וקולט אותו
            System.out.println("Enter test number " + numberTest + ": ");
            grade = in.nextInt();
            numberTest++;
        }
        // מראה למשתמש את המבחן עם התוצאה הכי גבוהה ואת התוצאה הכי נמוכה
        System.out.println("The maxx grade is: " + maxGrade);
        System.out.println("The lit grade is: " + litGrade);

    }    
}

