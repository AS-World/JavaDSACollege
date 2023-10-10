// Simple Traffic Light: Implement a program that simulates a simple traffic light with states like "Red," "Yellow," and "Green." Use a switch statement to handle the transitions between states.
package switchCase;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("For Red press 1");
        System.out.println("For Yellow press 2");
        System.out.println("For Green press 3");
        System.out.print("\nEnter Your Choice : ");

        choice = sc.nextInt();
        sc.close();

        switch (choice) {
            case 1:
                System.out.println("Red");
                break;
        
            case 2:
                System.out.println("Yellow");
                break;
        
            case 3:
                System.out.println("Green");
                break;
        
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
