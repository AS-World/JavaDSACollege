package Training;

import java.util.Scanner;

public class PrintDigits {
    static void printDigits(int n) {
        if (n == 0) {
            return;
        }
        
        printDigits(n/10);
        System.out.println(n%10);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();
        printDigits(n);
    }
}
