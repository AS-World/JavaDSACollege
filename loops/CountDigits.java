//Program of Count digits
package loops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        int n, count = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        n = sc.nextInt();
        sc.close();
        temp = n;
        if(n == 0){
            count++;
        }
        while(temp > 0){
            count++;
            temp /= 10;
        }
        System.out.println("Number of digits : "+count);
    }
}
