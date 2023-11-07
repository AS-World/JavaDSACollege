package Recursion;

import java.util.Scanner;

public class DigitSum {
    public static int digitSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n%10 + digitSum(n/10);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();
        System.out.println("Digits sum is "+digitSum(n));

    }
}
