import java.util.Scanner;

public class ProgramBMI {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Weight(in Kg) : ");
        weight = sc.nextDouble();
        System.out.print("Enter Height(in m) : ");
        height = sc.nextDouble();
        bmi = weight/(height*height);
        sc.close();
        System.out.println(bmi < 18.5 ? "Underweight" : (bmi >= 18.50 && bmi <= 25.99) ? "Normal" : (bmi >= 25 && bmi <= 29.99) ? "Overweight" : "Obese");
    }
}
