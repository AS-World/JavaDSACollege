// Factorial: Write a program to calculate the factorial of a given number using a loop (e.g., 5! = 5 x 4 x 3 x 2 x 1).
package loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long n, fact = 1, temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextLong();
        temp = n;
        sc.close();
        while (temp > 0) {
            fact *= temp;
            temp--;
        }
        System.out.println("factorial of "+n+" is : "+fact);
    }
}
