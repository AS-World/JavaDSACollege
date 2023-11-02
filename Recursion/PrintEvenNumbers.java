package Recursion;

import java.util.Scanner;

public class PrintEvenNumbers {
    public static void printEvens(int n) {
        if (n <= 0) {
            return;
        }
        printEvens(n-1);
        if ((n&1) == 0) {
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();
        printEvens(n);
    }
}
