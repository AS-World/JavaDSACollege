package Recursion;

import java.util.Scanner;

public class EvenOddInRange {
    public static void printEvenOdd(int n) {
        if (n == 0) {
            return;
        }
        printEvenOdd(n-1);
        System.out.println(n + ((n&1) == 0 ? " is Even" : " is Odd"));
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        printEvenOdd(n);
        sc.close();

    }
}
