import java.util.Scanner;

public class ProgramRectangleArea {
    public static void main(String[] args) {
        int l, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of Length : ");
        l = sc.nextInt();
        System.out.println("Enter value of Width : ");
        b = sc.nextInt();
        sc.close();
        System.out.println("Area of Rectangle is "+(l*b));
    }
}
