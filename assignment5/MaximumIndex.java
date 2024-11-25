package DSA_GATE.Assignment5;

public class MaximumIndex {
    static int maxIndexDiff(int[] arr, int n) {
        int[] LeftMin = new int[n];
        int[] RightMax = new int[n];

        
        LeftMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            LeftMin[i] = Math.min(arr[i], LeftMin[i - 1]);
        }

      
        RightMax[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            RightMax[j] = Math.max(arr[j], RightMax[j + 1]);
        }

        
        int i = 0, j = 0, maxDiff = -1;
        while (j < n && i < n) {
            if (LeftMin[i] < RightMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int n = arr.length;
        System.out.println("Maximum index difference is: " + maxIndexDiff(arr, n));
    }
}
