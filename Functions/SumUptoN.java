package Functions;

// 24. WAP to print sum of  1+2+3+.............................n 
import java.util.Scanner;

public class SumUptoN {
  static int sumN(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    return sum;
  }

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any Nubmber : ");
    n = sc.nextInt();
    sc.close();

    System.out.println("Sum : " + sumN(n));
  }
}
