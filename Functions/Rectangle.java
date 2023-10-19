package Functions;

import java.util.Scanner;

public class Rectangle {
    static double area(double length, double breadth) {
        return length*breadth;
    }

    static double perimeter(double length, double breadth) {
        return 2*(length+breadth);
    }

    public static void main(String[] args) {
        double length, breadth;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of Length : ");
        length = sc.nextDouble();
        System.out.print("Enter value of Breadth : ");
        breadth = sc.nextDouble();
        sc.close();

        System.out.println("Area : "+area(length, breadth));
        System.out.println("Perimeter : "+perimeter(length, breadth));
    }
}
