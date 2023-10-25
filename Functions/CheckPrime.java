package Functions;
// 15. WAP to check whether the given no. is prime or not.

import java.util.Scanner;

public class CheckPrime {
    static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        n = sc.nextInt();
        sc.close();

        if (isPrime(n)) {
            System.out.println(n+" is Prime Number");
        } else {
            System.out.println(n+" is not a Prime Number");
        }
    }
}
