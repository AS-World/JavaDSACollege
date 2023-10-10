import java.util.Scanner;

public class ProgramDigitSum {
    public static void main(String[] args) {
        int sum = 0, n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        n = sc.nextInt();
        sc.close();
        temp = n;
        while (temp > 0) {
            sum += temp%10;
            temp /= 10;
        }
        System.out.println("Sum of Digits is "+sum);
    }
}
