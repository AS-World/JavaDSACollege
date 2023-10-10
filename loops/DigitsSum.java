// Digit Sum.You are given an integer number, say 123 the output will be 1+2+3=6.
package loops;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        int n, temp, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();
        temp = n;
        while(temp > 0) {
            sum += temp%10;
            temp /= 10;
        }
        System.out.println("Sum of "+n+" digits is "+sum);
    }
}
