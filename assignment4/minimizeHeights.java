package DSA_GATE.Assignment4;

import java.util.Arrays;

public class minimizeHeights {
    
    public static int minDifference(int[] arr, int k) {
        if (arr.length == 1) return 0;

      
        Arrays.sort(arr);
        
        int n = arr.length;
        int originalDifference = arr[n - 1] - arr[0]; 
        
        
        int minDifference = originalDifference;
        
       
        for (int i = 0; i < n - 1; i++) {
            int max = Math.max(arr[n - 1] - k, arr[i] + k);
            int min = Math.min(arr[0] + k, arr[i + 1] - k);
            minDifference = Math.min(minDifference, max - min);
        }
        
        return minDifference;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 6, 4, 15, 17, 10};
        int k1 = 6;
        System.out.println(minDifference(arr1, k1));  

        int[] arr2 = {12, 6, 4, 15, 17, 10};
        int k2 = 3;
        System.out.println(minDifference(arr2, k2)); 
    }
}
