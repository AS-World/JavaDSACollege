package Functions;
/*  7. WAP to calculate net salary of employee, take basic salary of employee and calculate
 	HRA 30% of basic salary, 
	DA 20% of the basic salary, 
	TA 10% of the basic salary and 
	Net salary is sum up of basic salary+ allowances-pf.
 	Pf is 1400 fix. */

import java.util.Scanner;

public class Salary2 {
    static double HRA(double basicSalary) {
        return .3*basicSalary;
    }

    static double DA(double basicSalary) {
        return .2*basicSalary;
    }

    static double TA(double basicSalary) {
        return .1*basicSalary;
    }

    static double netSalary(double basicSalary) {
        return basicSalary-1400;
    }

    public static void main(String[] args) {
        double basicSalary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary : ");
        basicSalary = sc.nextDouble();
        sc.close();

        System.out.println("HRA : "+HRA(basicSalary));
        System.out.println("DA : "+DA(basicSalary));
        System.out.println("TA : "+TA(basicSalary));
        System.out.println("Net Salary : "+netSalary(basicSalary));
    }
}
