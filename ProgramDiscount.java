/*Discount Calculator: Create a program that calculates the discount amount for a customer's purchase based on their total bill and a set of discount rules. Apply different discounts based on the purchase amount. Also print the bill recipt on the output screen.

	1k-5k then 5% off
	5k-10k then 10% off
	10-20k- then 15% off
	Anything above 20k then 25%off */

import java.util.Scanner;

public class ProgramDiscount {
    public static void main(String[] args) {
        double amount, discount = 0;
        Scanner sc = new Scanner(System.in);
        amount = sc.nextDouble();
        sc.close();

        if (amount < 1_000) {
            discount = 0;
        } else if (amount < 5_000) {
            discount = amount*0.05;
        } else if (amount < 10_000) {
            discount = amount*0.1;
        } else if (amount < 20_000) {
            discount = amount * 0.15;
        } else {
            discount = amount * 0.25;
        }

        System.out.println("You got "+discount+" discount on your "+amount+" purchase");
    }
}
