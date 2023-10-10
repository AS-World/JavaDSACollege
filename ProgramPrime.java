import java.util.Scanner;

public class ProgramPrime {
    public static void main(String[] args) {
        boolean isPrime = true;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();

        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && n > 1) {
            System.out.println(n+" is a Prime Number");
        } else {
            System.out.println(n+" is Not a Prime Number");
        }
    }
}
