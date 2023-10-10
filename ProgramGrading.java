import java.util.Scanner;

public class ProgramGrading {
    public static void main(String[] args) {
        double sub1, sub2, sub3, res;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Subject Marks : ");
        sub1 = sc.nextDouble();
        System.out.print("Enter 2nd Subject Marks : ");
        sub2 = sc.nextDouble();
        System.out.print("Enter 3rd Subject Marks : ");
        sub3 = sc.nextDouble();
        sc.close();

        res = (sub1+sub2+sub3)/3;
        if (res < 50) {
            System.out.println("F");
        } else if (res >= 50 && res < 60) {
            System.out.println("E Grade");
        } else if (res >= 60 && res < 70) {
            System.out.println("D Grade");
        } else if (res >= 70 && res < 80) {
            System.out.println("C Grade");  
        } else if (res >= 80 && res < 90) {
            System.out.println("B Grade");
        } else if (res >= 90) {
            System.out.println("A Grade");
        } 
    }
}
