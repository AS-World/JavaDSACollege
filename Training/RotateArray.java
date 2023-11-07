package Training;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k, len = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of K : ");
        k = sc.nextInt();
        sc.close();

        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[(i+k)%len];
        }

        System.out.println(Arrays.toString(res));
    }
}
