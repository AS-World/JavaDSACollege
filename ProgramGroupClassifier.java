import java.util.Scanner;

public class ProgramGroupClassifier {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        age = sc.nextInt();
        sc.close();
        System.out.println(age < 13 ? "Children" : age < 18 ? "Teenager" : age < 65 ? "Adult" : "Senior");
    }
}
