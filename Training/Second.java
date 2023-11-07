package Training;

public class Second {
    public static void main(String[] args) {
        int[] arr = {1, 8, 8, 9,9,2,3,4, 5};
        int idxMax = 0;
        int idxSecond = -1;
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                idxSecond = idxMax;
                secondMax = max;
                max = arr[i];
                idxMax = i;
            } else if (secondMax < arr[i] && max != arr[i]) {
                secondMax = arr[i];
                idxSecond = i;
            }
        }

        System.out.println("Index of Second max is "+idxSecond);
    }
}
