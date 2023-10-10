import java.util.Scanner;

public class ProgramSalary {
    public static void main(String[] args) {
        String name;
        double basicSalary, gross, net, tax = 0;
        final double TA = 2000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        System.out.print("Enter Basic Salary : ");
        basicSalary = sc.nextDouble();
        sc.close();
        if (basicSalary < 10_000) {
            tax = 0;
        } else if (basicSalary >= 10_000 && basicSalary < 20_000) {
            tax = basicSalary*0.1;
        } else if (basicSalary >= 20_000 && basicSalary < 30_000) {
            tax = basicSalary*0.2;
        } else if (basicSalary >= 30_000) {
            tax = basicSalary*0.25;
        }
        gross = basicSalary+0.3*basicSalary+0.2*basicSalary+TA; 
        net = gross-tax;
        System.out.println("Details :-");
        System.out.println("Name : "+name);
        System.out.println("Gross : "+gross);
        System.out.println("Net : "+net);
    }
}
