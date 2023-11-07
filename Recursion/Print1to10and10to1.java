package Recursion;

import java.util.Scanner;

public class Print1to10and10to1 {
    public static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(10-n+1);
        print(n-1);
        System.out.println(10-n+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();
        sc.close();
        print(n);
    }
}
