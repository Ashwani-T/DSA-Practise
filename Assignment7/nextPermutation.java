package DSA_GATE.Assignment7;

import java.util.Arrays;

public class nextPermutation {
    /* 0 */ public static void nextPermutation(int[] nums) {
        // pivot is the element just before the non-increasing (weakly decreasing)
        // suffix
        /* 2 */ int pivot = indexOfLastPeak(nums) - 1;
        // paritions nums into [prefix pivot suffix]
        if (pivot != -1) {
            int nextPrefix = lastIndexOfGreater(nums, nums[pivot]);
            // in the worst case it's suffix[0]
            // next prefix must exist because pivot < suffix[0], otherwise pivot would be
            // part of suffix
            /* 4 */ swap(nums, pivot, nextPrefix); // this minimizes the change in prefix
        }
        /* 5 */ reverseSuffix(nums, pivot + 1);
        // reverses the whole list if there was no pivot
        /* 6 */ }

    /**
     * Find the last element which is a peak.
     * In case there are multiple equal peaks, return the first of those.
     * 
     * return first index of last peak
     */
    /* 1 */ static  int indexOfLastPeak(int[] nums) {
        for (int i = nums.length - 1; 0 < i; --i) {
            if (nums[i - 1] < nums[i])
                return i;
        }
        return 0;
    }

    /** return last index where the {code num > threshold} or -1 if not found */
    /* 3 */ static int lastIndexOfGreater(int[] nums, int threshold) {
        for (int i = nums.length - 1; 0 <= i; --i) {
            if (threshold < nums[i])
                return i;
        }
        return -1;
    }

    /** Reverse numbers starting from an index till the end. */
    static void reverseSuffix(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start++, end--);
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int num[]={1,2,3};
        System.out.println("previous permutation: "+Arrays.toString(num));
        nextPermutation(num);
        System.out.println("next permutation: "+Arrays.toString(num));
    }
}
