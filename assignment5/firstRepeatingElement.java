package DSA_GATE.Assignment5;

import java.util.*;

public class firstRepeatingElement {
    public static int findFirstRepeating(int[] arr) {
        Map<Integer, int[]> elementMap = new HashMap<>();
        
        // Populate the map with element data
        for (int i = 0; i < arr.length; i++) {
            if (!elementMap.containsKey(arr[i])) {
                // Store the first occurrence index and initialize count
                elementMap.put(arr[i], new int[]{i + 1, 1}); // index + 1 for 1-based index
            } else {
                // Increment the count
                elementMap.get(arr[i])[1]++;
            }
        }
        
        int minFirstIndex = Integer.MAX_VALUE;
        for (Map.Entry<Integer, int[]> entry : elementMap.entrySet()) {
            int index = entry.getValue()[0];
            int count = entry.getValue()[1];
            
            // Check if the element has repeated and find the smallest index of first occurrence
            if (count > 1 && index < minFirstIndex) {
                minFirstIndex = index;
            }
        }
        
        // If no repeating element is found, return a special value (like 0 or -1)
        return (minFirstIndex == Integer.MAX_VALUE) ? -1 : minFirstIndex;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println("First repeating element is at index: " + findFirstRepeating(arr));
    }
}
