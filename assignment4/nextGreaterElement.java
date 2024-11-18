package DSA_GATE.assignment4;

import java.util.*;

public class nextGreaterElement {
    public static void printNextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n]; // This will store the result
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(nge, -1);

        for (int i = n - 1; i >= 0; i--) {
            
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

           
            if (!stack.isEmpty()) {
                nge[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        
        System.out.println(Arrays.toString(nge));
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 2, 25};
        System.out.println("Next greater elements for the first example:");
        printNextGreaterElement(arr1);

        int[] arr2 = {13, 7, 6, 12};
        System.out.println("Next greater elements for the second example:");
        printNextGreaterElement(arr2);
    }
}
