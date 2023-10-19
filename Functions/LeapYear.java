package Functions;

import java.util.Scanner;

public class LeapYear {
    static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) { 
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        sc.close();

        if (isLeapYear(year)) {
            System.out.println("Year is Leaper");
        } else {
            System.out.println("Year is not Leaper");   
        }
    }
}