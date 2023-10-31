package Functions;

import java.util.Scanner;

public class RotateNumber {
    static int countDigits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    static int rotateForward(int n, int r) {
        int len = countDigits(n);
        boolean isNegative = r < 0;
        r = (r*(r < 0 ? -1 : 1))%len;
        int powOf10 = (int) Math.pow(10, len-1);
        if (!isNegative) {
            while (r > 0) {
                int digit = n/powOf10;
                n = n%powOf10;
                n = n*10 + digit;
                r--;
            } 
        } else {
            while (r > 0) {
                int digit = n%10;
                n /= 10;
                n = digit*powOf10 + n;
                r--;
            } 
        }

        return n;
    }
    public static void main(String[] args) {
        int n, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        System.out.print("Enter number to rotate : ");
        r = sc.nextInt();
        sc.close();

        System.out.println(rotateForward(n, r));
    }
}
