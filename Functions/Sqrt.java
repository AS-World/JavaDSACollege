package Functions;

// 23. WAP to print the square root of a no.
import java.util.Scanner;

public class Sqrt {
  static double sqrt(int n) {
    return Math.sqrt(n);
  }

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any Nubmber : ");
    n = sc.nextInt();
    sc.close();

    System.out.println("Square root : " + sqrt(n));
  }
}