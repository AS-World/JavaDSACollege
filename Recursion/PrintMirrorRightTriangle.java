package Recursion;

import java.util.Scanner;

public class PrintMirrorRightTriangle {
    public static void printLine(int n, char c) {
        if (n == 0) {
            return;
        }

        System.out.print(c+" ");
        printLine(n-1, c);
    }

    public static void printRightTriangle(int row, int col) {
        if (row == 0) {
            return;
        }

        printRightTriangle(row-1, col);
        printLine(col-row, ' ');
        printLine(row, '*');
        System.out.println();
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();
        printRightTriangle(n, n);
    }
}
