package Recursion;

import java.util.Scanner;

public class SolidSquare {
    public static void printLine(int n, char c) {
        if (n == 0) {
            return;
        }

        System.out.print(c+" ");
        printLine(n-1, c);
    }

    public static void printSolidSquare(int row, int col) {
        if (row == 0) {
            return;
        }

        printLine(col, '*');
        System.out.println();
        printSolidSquare(row-1, col);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();
        printSolidSquare(n, n);
    }
}
