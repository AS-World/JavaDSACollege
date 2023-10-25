package Functions;

// 18. WAP to print the sum of digit of a no.
import java.util.Scanner;

public class SumOfDigits {
  static int sumOfDigits(int n) {
    int sum = 0;

    while(n > 0) {
      sum += (n%10);
      n /=10;
    }

    return sum;
  }

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any Nubmber : ");
    n = sc.nextInt();
    sc.close();

    System.out.println("Sum of "+n+" digits is " + sumOfDigits(n));
  }
}