package Functions;

import java.util.Scanner;

public class Swap {
    static int a;
    static int b;
    
    static void swap() {
        a ^= b;
        b = a^b;
        a ^= b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value of a : ");
        a = sc.nextInt();
        System.out.print("Enter Value of b : ");
        b = sc.nextInt();
        sc.close();

        System.out.println("values Before Swap");
        System.out.println("A : "+a);
        System.out.println("B : "+b);

        swap();
        System.out.println("values After Swap");
        System.out.println("A : "+a);
        System.out.println("B : "+b);
    }
}
