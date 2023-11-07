package Training;

public class SecondMax {
    public static void main(String[] argv) {
        int[] arr = {1,2,3,4,4,5,7,7};

        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                secMax = max;
                max = arr[i];
            } else if (secMax < arr[i] && arr[i] != max) {
                secMax = arr[i];
            }
        }

        System.out.println(secMax);
    }
}