package Recursion;

import java.util.Scanner;

public class PrintRightTriangle {
    public static void printLine(int n, char c) {
        if (n == 0) {
            return;
        }

        System.out.print(c+" ");
        printLine(n-1, c);
    }

    public static void printRightTriangle(int row) {
        if (row == 0) {
            return;
        }

        printRightTriangle(row-1);
        printLine(row, '*');
        System.out.println();
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();
        printRightTriangle(n);
    }
}
