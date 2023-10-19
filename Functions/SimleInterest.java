package Functions;

import java.util.Scanner;

public class SimleInterest {
    static double SI(double principle, double rate, double time) {
        return (principle*rate*time)/100;
    }
    
    public static void main(String[] args) {
        double principle, rate, time;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle : ");
        principle = sc.nextDouble();
        System.out.print("Enter Rate : ");
        rate = sc.nextDouble();
        System.out.print("Enter Time : ");
        time = sc.nextDouble();
        sc.close();

        System.out.println("Simple Interest : "+SI(principle, rate, time));
    }
}
