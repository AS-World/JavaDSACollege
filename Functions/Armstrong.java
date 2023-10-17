package Functions;

import java.util.Scanner;

public class Armstrong {
    static int pow(int n, int p) {
        if(n == 0 || p == 0) {
            return 1;
        }

        return n*pow(n, p-1);
    }

    static int length(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }

        return count;
    }

    static boolean isArmstrong(int n) {
        int len = length(n), sum = 0, org = n;

        while (n > 0) {
            sum += pow(n%10, len);
            n /= 10;
        }

        return org == sum;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        n = sc.nextInt();
        sc.close();

        if (isArmstrong(n)) {
            System.out.println(n+" is Armstorng");
        } else {
            System.out.println(n+" is Not Armstorng");
        }
    }
}
