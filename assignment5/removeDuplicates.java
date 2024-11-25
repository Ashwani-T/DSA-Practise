package DSA_GATE.Assignment5;

import java.util.Arrays;

public class removeDuplicates {
    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return n;

        int idx = 1; // Start from the second element
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = removeDuplicates(arr);

        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, newSize)));
    }
}
