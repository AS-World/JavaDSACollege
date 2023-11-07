package Recursion;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n, int div) {
        if (div > n/2) {
            return true;
        }
        if (n%div == 0) {
            return false;
        }
        return isPrime(n, div+1);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();
        
        System.out.println(n+(isPrime(n, 2) ? " is Prime" : " is not a Prime"));
    }
}
