// 20. WAP to find the factorial of a no.
package Functions;

import java.util.Scanner;

public class Factorial {
  static int factorial(int n) {
    int fact = 1;

    for(int i = 1; i <= n; i++) {
      fact *= i;
    }

    return fact;
  }

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any Nubmber : ");
    n = sc.nextInt();
    sc.close();

    System.out.println("Factorial of "+n+" is " + factorial(n));
  }
}