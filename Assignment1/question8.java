package DSA_GATE.Assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question8 {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], interval[1]);
            } else {
                merged.add(prev);
                prev = interval;
            }
        }

        merged.add(prev);

        return merged.toArray(new int[merged.size()][]);         
    }
    public static void main(String[] args) {
        int arr[][]={{7, 8}, {1, 5}, {2, 4}, {4, 6}};
        System.out.println(Arrays.deepToString(merge(arr)));
    }
}
