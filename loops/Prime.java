// Prime Number: Write a Java program to check if a given number is prime or not using loops and conditional statements. 
package loops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();

        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                System.out.println(n+" is Not a Prime Number");
                return;
            }
        }
        System.out.println(n+" is a Prime Number");
    }
}
