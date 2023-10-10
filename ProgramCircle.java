import java.util.Scanner;

public class ProgramCircle {
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        sc.close();
        System.out.println("Area of Circle is "+(Math.PI*r*r));
    }
}
