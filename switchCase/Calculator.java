// Menu-Driven Calculator: Create a menu-driven calculator program that allows the user to choose from a list of operations (addition, subtraction, multiplication, division) using a switch statement. Take two numbers as input and perform the selected operation.
package switchCase;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2, res = 0;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        num2 = sc.nextInt();
        sc.close();

        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.print("Enter Your Choice : ");
        choice = sc.nextInt();
        sc.close();

        switch (choice) {
            case 1:
                res = num1+num2;
                break;
        
            case 2:
                res = num1-num2;
                break;
        
            case 3:
                res = num1*num2;
                break;
        
            case 4:
                res = num1/num2;
                break;
        }

        System.out.println("Result : "+res);
    }
}
