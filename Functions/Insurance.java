package Functions;

import java.util.Scanner;

/*
  11. A Insurance Company have a following polices (Insurance Premium Calculation program)
		User Input :
                    a. Person Name
                    b. Person gender
                    c. Person Age
                    d. Person city (Metro or Non-Metro)
	Conditions:
		if person age is 25 to 35 and gender is male and city is metro , Output is Premium is 6%
		if person age is 25 to 40 and gender is male and city is non-metro, Output is Premium 4%
		if person age is 25 to 42 and gender is female and city is Metro, Output is Premium 3%
		if person age is 25 to 45 and gender is female and city is non-metro , output is Premium 2%
		else
 		Not Insured
 */

public class Insurance {
	static void premium(char gender, int age, char city) {
		if ((age >= 25 && age <= 35) && gender == 'M' && city == 'Y') {
			System.out.println("Premium is 6%");
		} else if ((age >= 25 && age <= 40) && gender == 'M' && city == 'N') {
			System.out.println("Premium is 4%");
		} else if ((age >= 25 && age <= 42) && gender == 'F' && city == 'Y') {
			System.out.println("Premium is 3%");
		} else if ((age >= 25 && age <= 45) && gender == 'F' && city == 'N') {
			System.out.println("Premium is 2%");
		} else {
			System.out.println("Not Insured");
		}
	}

    public static void main(String[] args) {
		char cityIsMetro, gender;
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		sc.nextLine();

		System.out.print("Enter city is metro (Y/N)");
		cityIsMetro = sc.next().charAt(0);

		System.out.print("Enter Gender (M/F)");
		gender = sc.next().charAt(0);

		System.out.print("Enter Age : ");
		age = sc.nextInt();

		sc.close();

		premium(gender, age, cityIsMetro);
	}
}
