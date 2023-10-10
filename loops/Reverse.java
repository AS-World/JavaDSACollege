// Reverse a Number: Write a program to reverse a given number using loops.
package loops;

import java.util.Scanner;

public class Reverse {
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
        System.out.println("reverse of "+n+" is "+rev);
    }
}
