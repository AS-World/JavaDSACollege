package loops;

import java.util.*;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        boolean[] res = new boolean[n+1];
        Arrays.fill(res, true);
        res[0] = false;
        res[1] = false;
        for (int i = 2; i*i <= n; i++) {
            for (int j = i << 1; j <= n; j += i) {
                res[j] = false;
            }
        }

        for (int i = 0; i < res.length; i++) {
            if(res[i]){
                System.out.print(i+" ");
            }
        }
    }
}
