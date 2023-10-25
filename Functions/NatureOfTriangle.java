package Functions;
// 8. WAP to check whether the triangle is isosceles , equilateral or scalene.

import java.util.Scanner;

public class NatureOfTriangle {
    static String nature(int a, int b, int c) {
        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || c == a) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of side 1 : ");
        a = sc.nextInt();
        System.out.print("Enter value of side 2 : ");
        b = sc.nextInt();
        System.out.print("Enter value of side 3 : ");
        c = sc.nextInt();
        sc.close();

        System.out.println("Given Triangle is : "+nature(a, b, c));
    }
}
