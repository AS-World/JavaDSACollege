package Functions;

import java.util.Scanner;

public class Salary {
    static double tax(double basicSalary) {
        if (basicSalary >= 10_000 && basicSalary < 20_000) {
            return basicSalary*0.1;
        } else if (basicSalary >= 20_000 && basicSalary < 30_000) {
            return basicSalary*0.2;
        } else if (basicSalary >= 30_000) {
            return basicSalary*0.25;
        }

        return 0;
    }

    static double gross(double basicSalary, double TA) {
        return basicSalary+0.3*basicSalary+0.2*basicSalary+TA;
    }

    static double net(double basicSalary, double TA) {
        return gross(basicSalary, TA)-tax(basicSalary);
    }

    public static void main(String[] args) {
        String name;
        double basicSalary;
        final double TA = 2000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        System.out.print("Enter Basic Salary : ");
        basicSalary = sc.nextDouble();
        sc.close();
        
        System.out.println("Details :-");
        System.out.println("Name : "+name);
        System.out.println("Gross : "+gross(basicSalary, TA));
        System.out.println("Net : "+net(basicSalary, TA));
    }
}
