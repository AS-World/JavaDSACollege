package Recursion;

import java.util.Scanner;

public class PrintPrimeNumbers {
    public static boolean isPrime(int n, int div) {
        if (div > n/2) {
            return true;
        }

        if (n%div == 0) {
            return false;
        }

        return isPrime(n, div+1);
    }

    public static void printPrime(int n) {
        if (n < 2) {
            return;
        }

        printPrime(n-1);
        if (isPrime(n, 2)) {
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();
        printPrime(n);
    }
}
