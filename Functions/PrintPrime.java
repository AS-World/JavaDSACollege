package Functions;
// 16. WAP to print the  prime number between 1 to 100.

import java.util.Arrays;

public class PrintPrime {
    static void printPrime() {
        boolean[] isPrime = new boolean[101];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i*i <= 100; i++) {
            for (int j = i+i; j <= 100; j += i) {
                isPrime[j] = false;
            }
        }

        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        printPrime();
    }
}
