package Functions;

// WAP to print sum of 12+22+32+..........................n2 
import java.util.Scanner;

public class SumX2 {
  static int sumX2(int n) {
    int sum = 0;
    for(int i = 1; i <= n; i++) {
      sum += i*10+2;
    }

    return sum;
  }
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any Nubmber : ");
    n = sc.nextInt();
    sc.close();

    System.out.println("Sum : "+sumX2(n));
  }
}
