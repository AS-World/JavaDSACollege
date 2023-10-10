import java.util.Scanner;

public class ProgramPalindrome {
    public static void main(String[] args) {
        String input;
        boolean isPalindrome = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Something : ");
        input = sc.next();
        sc.close();
        for (int i = 0, j = input.length()-1; i < input.length()/2; i++, j--) {
            if (input.charAt(i) != input.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input+" is Palindrome");
        } else {
            System.out.println(input+" is Not Palindrome");
        }
    }
}
