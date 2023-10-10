// Palindrome Number: Write a Java program to check if a given number is a palindrome (e.g., 121, 1331) using loops and conditional statements.
package loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n, temp, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        n = sc.nextInt();
        sc.close();
        temp = n;
        while (temp > 0) {
            rev = rev*10+temp%10;
            temp /= 10;
        }
        if (n == rev) {
            System.out.println(n+" is Palindrome");
        } else {
            System.out.println(n+" is not Palindrome");
        }
    }
}
