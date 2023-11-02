package Recursion;

import java.util.Scanner;

public class PrintFactorial {
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();
        System.out.println(factorial(n));
    }
}
