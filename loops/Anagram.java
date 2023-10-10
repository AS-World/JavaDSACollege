// Anagram Checker: Write a program that checks whether two given strings are anagrams of each other (i.e., they have the same characters in a different order).
package loops;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String : ");
        String s1 = sc.nextLine();
        System.out.print("\nEnter 2nd String : ");
        String s2 = sc.nextLine();
        sc.close();
        char[] temp = s1.toCharArray();
        Arrays.sort(temp);
        s1 = new String(temp);
        temp = s2.toCharArray();
        Arrays.sort(temp);
        s2 = new String(temp);
        
        System.out.print("Both Strings are ");
        System.out.println(s1.equals(s2) ? "same" : "not same");
    }
}
