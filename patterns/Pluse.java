package patterns;

import java.util.Scanner;

public class Pluse {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();

        for (int i = 0; i <= 2*n; i++) {
            for (int j = 0; j <= 2*n; j++) {
                if (i == n || j == n) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}