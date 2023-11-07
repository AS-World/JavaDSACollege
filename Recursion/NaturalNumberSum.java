package Recursion;

import java.util.Scanner;

public class NaturalNumberSum {
    public static int sumN(int n) throws Exception {
        if (n < 0) {
            throw new Exception("N can't be negative");
        }
        if (n <= 0) {
            return 0;
        }
        return n + sumN(n-1);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        try {
            System.out.println("Sum is : "+sumN(n));
        } catch (Exception e) {
            sc.close();
            System.out.println(e.getMessage());
        }

    }
}
