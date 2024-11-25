package DSA_GATE.Assignment3;

import java.util.Arrays;

public class longestSubsequent {
    public static int maxSubsequent(int arr[]) {

        Arrays.sort(arr);
        int ans = 1, max = 1;

        if (arr.length == 0) {
            return 0;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == 0) {
                continue;
            }
            if (arr[i] - arr[i - 1] == 1) {

                ans += 1;
                if (ans > 1) {
                    max = Math.max(max, ans);
                }
            } else {
                ans = 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 53, 57, 77, 15, 78, 58, 17, 63, 90, 73, 68, 82, 40, 68, 22, 52, 81, 92, 80, 37, 62, 17, 76, 67,
                55, 56, 20, 22, 37, 71, 65, 7, 30, 93, 1, 1, 90, 46, 36, 74, 0, 37, 76, 69, 39, 97, 39, 30, 14, 89, 74,
                71, 27, 79, 51, 45, 51, 54, 90, 35, 68, 38, 7, 82, 55, 65, 14, 40, 20, 64, 89, 95, 8, 43, 14, 88, 5, 24,
                72, 9, 56, 17, 60, 91, 16, 94, 47, 15, 33 };
        System.out.println(maxSubsequent(arr));
    }
}
