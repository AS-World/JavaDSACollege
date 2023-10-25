package Functions;
// 17. WAP to print the even number and odd number between 1 to 100.

public class OddEvenInRange {
  static void printOddEven() {
    for(int i = 1; i <= 100; i++) {
      System.out.println(i+ ((i&1) == 0 ? " is Even" : " is Odd"));
    }
  }

  public static void main(String[] args) {
    printOddEven();
  }
}