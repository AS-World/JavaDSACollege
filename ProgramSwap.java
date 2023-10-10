import java.util.Scanner;

public class ProgramSwap {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        b = sc.nextInt();
        sc.close();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("value of a is "+a+" and value of b is "+b);
    }
}
