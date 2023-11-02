package Recursion;

import java.util.Scanner;

public class Print0toN {
    static void printN(int n) {
        if (n < 0) {
            return;
        }
        printN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();
        printN(n);
    }
}
