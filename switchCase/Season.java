// Season Determiner: Create a program that takes a month as input and uses a switch statement to determine the season (e.g., spring, summer, fall, or winter) associated with that month.
package switchCase;
import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        String month;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Month Name : ");
        month = sc.next().toLowerCase();
        sc.close();

        switch (month) {
            case "januray":
            case "february":
            case "march":
                System.out.println("Winter");
                break;
        
            case "april":
            case "may":
            case "june":
                System.out.println("Spring");
                break;
        
            case "july":
            case "august":
            case "september":
                System.out.println("Summer");
                break;
        
            case "october":
            case "november":
            case "december":
                System.out.println("Fall");
                break;
        
            default:
                System.out.println("Invalid Month Name");
                break;
        }
    }
}
