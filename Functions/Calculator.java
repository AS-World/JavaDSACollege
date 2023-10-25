package Functions;
/*14. WAP to create a menu driven program 
	Press 1 for Addition
	Press 2 for Subtraction
	Press 3 for Multiplication
	Press 4 for Division */

import java.util.Scanner;

public class Calculator {
    static double calculate(double a, double b) {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\tPress 1 for Addition");
        System.out.println("\tPress 2 for Subtraction");
        System.out.println("\tPress 3 for Multiplication");
        System.out.println("\tPress 4 for Division");
        System.out.print("\n\tEnter Your Choice : ");
        choice = sc.nextInt();
        sc.close();

        switch (choice) {
            case 1:
                return a+b;
            case 2:
                return a-b;
            case 3:
                return a*b;
            case 4:
                return a/b;
        
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        b = sc.nextInt();
        System.out.println("Result : "+calculate(a, b));
        sc.close();
    }
}
