// Fibonacci Series: Write a program to generate the Fibonacci series up to a specified number of terms using a loop (e.g., 0, 1, 1, 2, 3, 5, 8, ...).
package loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();
        while (n > 0) {
            System.out.print(a+" ");
            b += a;
            a = b-a;
            n--;
        }
    }
}
