/*Tax Calculator: Create a program that calculates the income tax for a person based on their income. Consider different tax slabs and apply the appropriate tax rate using if-else statements.

	If the salary is below 10k then no tax.
	if between 10k-20k then 10% tax
	if between 20k-30k then 15% tax
	and if the basic is above 30k then flat 25% tax is applicable.*/

import java.util.Scanner;

public class ProgramTax {
    public static void main(String[] args) {
        double salary, tax = 0;
        Scanner sc = new Scanner(System.in);
        salary = sc.nextDouble();
        sc.close();

        if (salary < 10_000) {
            tax = 0;
        } else if (salary < 20_000) {
            tax = 0.1*salary;
        } else if (salary < 30_000) {
            tax = 0.15*salary;
        } else {
            tax = 0.25*salary;
        }

        System.out.println("Tax : "+tax);
    }
}
