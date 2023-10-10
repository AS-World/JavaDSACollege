import java.util.Scanner;

public class ProgramCheckNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();

        System.out.println(n == 0 ? "Number is Zero" : (n < 0 ? "Number is Negative" : "Number is Positive") );
    }
}
