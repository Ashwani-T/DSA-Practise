package DSA_GATE.Assignment2;

import java.util.*;

public class question3 {
    public static boolean areEqual(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        if (n != m) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(arr1[i]) == null)
                map.put(arr1[i], 1);
            else {
                count = map.get(arr1[i]);
                count++;
                map.put(arr1[i], count);
            }
        }

        for (int i = 0; i < n; i++) {

            if (!map.containsKey(arr2[i]))
                return false;
            if (map.get(arr2[i]) == 0)
                return false;

            count = map.get(arr2[i]);
            --count;
            map.put(arr2[i], count);
        }

        return true;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 5};
        int arr2[] = { 2, 4, 15};

        if (areEqual(arr1, arr2))
            System.out.println("true");
        else
            System.out.println("false");
    }
}