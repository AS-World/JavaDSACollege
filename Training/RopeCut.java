package Training;

public class RopeCut {
    static int ropeCut(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        } else if (n < 0) {
            return -1;
        }

        int x = ropeCut(n-a, a, b, c);
        int y = ropeCut(n-b, a, b, c);
        int z = ropeCut(n-c, a, b, c);
        int res = Math.max(Math.max(x, y),z);

        return (res > -1 ? 1 : 0)+res;
    }
    public static void main(String[] args) {
        System.out.println(ropeCut(7, 2, 3, 5));
    }
}
