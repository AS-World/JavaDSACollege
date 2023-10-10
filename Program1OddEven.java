import java.util.*;

public class Program1OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int n  = sc.nextInt();
        sc.close();
        System.out.println((n&1) == 0 ? "Number is Even" : "Number is Odd");
    }
}
