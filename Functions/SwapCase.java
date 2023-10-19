package Functions;

import java.util.Scanner;

public class SwapCase {
    static String swapCase(String str) {
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 65 && c <= 90) {
                buffer.append((char)(c+32));
            }
            else if(c >= 97 && c <= 122) {
                buffer.append((char)(c-32));
            } else {
                buffer.append((char) c);
            }
        }

        return buffer.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String org;

        System.out.print("Enter a String : ");
        org = sc.nextLine();
        sc.close();

        System.out.println("Original String : "+org);
        System.out.println("New String : "+swapCase(org));
    }
}
