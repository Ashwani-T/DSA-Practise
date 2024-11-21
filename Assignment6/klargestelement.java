package DSA_GATE.Assignment6;

import java.util.*;

public class klargestelement {
    public static List<Integer> kLargest(int arr[], int k) {
        Arrays.sort(arr); // Sort the array in ascending order
        ArrayList<Integer> result = new ArrayList<>(); // Use "result" instead of "List"
        
        Stack<Integer> s = new Stack<>(); // Stack to reverse the order of elements
        
        // Push all elements of the array into the stack
        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
        }
        
        // Pop the top k elements from the stack and add them to the result list
        for (int i = 0; i < k; i++) {
            int num = s.pop(); // Pop the largest element
            result.add(num); // Add it to the result
        }
        
        return result; // Return the k largest elements
    }

    public static void main(String[] args) {
        int arr[] = {12, 5, 787, 1, 23}; // Input array
        int k = 2; // Number of largest elements to find
        System.out.println(kLargest(arr, k)); // Print the result
    }
}
