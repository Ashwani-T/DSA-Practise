package DSA_GATE.Assignment1;
import java.util.*;

public class question7 {
    public static int minDifference(int[] arr, int m) {
        if (m == 0 || arr.length == 0) {
            return 0;
        }

        if (arr.length < m) {
            return -1; 
        }

        Arrays.sort(arr);

        int minD = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < arr.length; i++) {
            int dif = arr[i + m - 1] - arr[i];
            minD = Math.min(minD, dif);
        }

        return minD;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 5;
        System.out.println(minDifference(arr, m));
    }
}
