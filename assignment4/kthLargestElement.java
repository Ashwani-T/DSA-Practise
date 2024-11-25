package DSA_GATE.Assignment4;

import java.util.*;



public class kthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.offer(nums[i]);
        }
        
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }
        
        return minHeap.peek();
    }
    public static void main(String[] args) {
        int arr[]={3, 5, 4, 2, 9};
        int k=3;
        System.out.println(findKthLargest(arr,k));
    }
}
