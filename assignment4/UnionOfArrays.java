package DSA_GATE.assignment4;

import java.util.HashSet;

public class UnionOfArrays {
    public static int countUnionElements(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements of array a to the set
        for (int num : a) {
            set.add(num);
        }

        // Add all elements of array b to the set
        for (int num : b) {
            set.add(num);
        }

        // The size of the set is the count of unique elements in the union
        return set.size();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3};

        System.out.println("The number of elements in the union is: " + countUnionElements(a, b));

        // Additional example
        int[] c = {1, 1, 2, 2, 2};
        int[] d = {2, 3, 3, 4, 4, 5, 5,66,7};

        System.out.println("The number of elements in the union is: " + countUnionElements(c, d));
    }
}
