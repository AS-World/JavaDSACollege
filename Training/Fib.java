package Training;

import java.util.Scanner;

public class Fib {
    public static int fib(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        return fib(n-1) + fib(n-2);
    }

    public static void printN(int n) {
        if (n <= 0) {
            return;
        }

        printN(n-1);
        System.out.print(fib(n)+" ");
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();
        printN(n);
    }
}
