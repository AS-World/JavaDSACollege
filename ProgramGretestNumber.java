import java.util.Scanner;

public class ProgramGretestNumber {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        n1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        n2 = sc.nextInt();
        System.out.println("Enter 3rd number : ");
        n3 = sc.nextInt();
        sc.close();

        System.out.println( (n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3)) + " Gretest Number");
    }
}
