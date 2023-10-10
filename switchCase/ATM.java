// Simple ATM Machine: Implement a simple ATM machine program using a switch statement. Allow users to check their balance, deposit money, and withdraw money. Keep track of the user's account balance.
package switchCase;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
        double currBalance = 0, money;
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nPress 1 for Checking Your Account Balance");
            System.out.println("Press 2 for Deposit money to Your Account");
            System.out.println("Press 3 for withdraw Your Account Balance");
            System.out.println("Press 4 for Exit");
            System.out.print("\nEnter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nYour Bank Balance : "+currBalance);
                    break;
            
                case 2:
                    System.out.print("Enter Your Amount for Deposit : ");
                    currBalance += sc.nextDouble();
                    break;
            
                case 3:
                    System.out.print("Enter Your Amount for Withdraw : ");
                    money = sc.nextDouble();
                    if (money <= currBalance) {
                        currBalance -= money;
                    } else {
                        System.out.println("\nInsufficient Balance");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nInvalid Choice!");
            }
        } while (choice != 4);
        sc.close();
    }
}
