package Training;

import java.util.Scanner;

public class Recursion {
    static boolean isPrime(int n, int div) {
        if (div > n>>1) { //if div > n/2
            return true;
        }

        if (n%div == 0) {
            return false;
        }

        return isPrime(n, div+1);
    }

    static void reverseString(String str, StringBuilder newString, int idx) {
        if (idx == str.length()-1) {
            newString.append(str.charAt(idx));
            return;
        }
        reverseString(str, newString, idx+1);
        newString.append(str.charAt(idx));
    }

    static String reverseString(String str, int idx) {
        if (idx == str.length()-1) {
            return Character.valueOf(str.charAt(idx)).toString();
        }
        
        return reverseString(str, idx+1) + str.charAt(idx);
    }

    public static int rev(int n, int curr) {
        if (n == 0) {
            return curr;
        }
        return rev(n/10, curr*10+(n%10));
    }

    public static int findIndex(int[] arr, int target, int idx) {
        if (idx == arr.length) {
            return -1;
        }

        if (arr[idx] == target) {
            return idx;
        }

        return findIndex(arr, target, idx+1);
    }

    static boolean isSorted(int[] arr, int idx) {
        if (idx == arr.length-1) {
            return true;
        }

        if (arr[idx] > arr[idx+1]) {
            return false;
        }
        
        return isSorted(arr, idx+1);
    }

    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return n*fact(n-1);
    }

    public static void main(String[] args) {
        // int n;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter any Number : ");
        // n = sc.nextInt();
        // sc.close();
        // System.err.println(isPrime(n, 2));
        // StringBuilder newStr = new StringBuilder();
        // reverseString("abcdefgh", newStr, 0);
        // System.out.println(newStr.toString());
        // System.out.println(rev(123, 0));
        // System.err.println(reverseString("abcdefgh", 0));
        int[] arr = {1,26,3,4,5};
        // System.out.println(findIndex(arr, 4, 0));
        System.out.println(isSorted(arr, 0));
        System.out.println(fact(5));
    }
}
