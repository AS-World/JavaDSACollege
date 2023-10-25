package Functions;
/*10. Find out the grade , according to given percentage of the user.
        a. >=90 print ‘A’ Grade
        b. 89 to 70 print ‘B’ Grade
        c. 69 to 50 print ‘C’ Grade
        d. <50 print ‘D’ Grade */

import java.util.Scanner;

public class Grade {
    static char grade(double percentage) { 
        if (percentage < 50) {
            return 'D';
        } else if (percentage >= 50 && percentage <= 69) {
            return 'C';
        } else if (percentage >= 70 && percentage <= 89) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public static void main(String[] args) {
        double percentage;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Percentage : ");
        percentage = sc.nextDouble();
        sc.close();

        System.out.println("Grade : "+grade(percentage));
    }
}
