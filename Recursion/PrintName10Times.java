package Recursion;

import java.util.Scanner;

public class PrintName10Times {
    public static void printName(int n, String name) {
        if (n == 0) {
            return;
        }
        System.out.println(name);
        printName(n-1, name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.next();
        sc.close();
        printName(10, name);
    }
}
