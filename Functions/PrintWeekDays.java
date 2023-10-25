package Functions;
// 12. WAP to print the Days of week and months of the year.

import java.util.Scanner;

public class PrintWeekDays {
    static void printWeekDays() {
        System.out.println("Monday");
        System.out.println("Tuesday");
        System.out.println("Wednesday");
        System.out.println("Thrusday");
        System.out.println("Friday");
        System.out.println("Saturday");
        System.out.println("Sunday");
    }

    static void printYearMonths() {
        System.out.println("Januray");
        System.out.println("February");
        System.out.println("March");
        System.out.println("April");
        System.out.println("May");
        System.out.println("June");
        System.out.println("July");
        System.out.println("August");
        System.out.println("September");
        System.out.println("October");
        System.out.println("November");
        System.out.println("December");
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Print Week Days ");
        System.out.println("Press 2 for Print Year Months ");
        System.out.print("\nEnter Your Choice : ");
        choice = sc.nextInt();
        System.out.println();
        sc.close();

        switch (choice) {
            case 1:
                printWeekDays();
                break;

            case 2:
                printYearMonths();
                break;
        
            default:
                System.out.println("Invalid Choice!");
                break;
        }
    }
}
