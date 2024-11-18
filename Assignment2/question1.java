package DSA_GATE.Assignment2;

public class question1 {
    public static int knapsack(int capacity, int[] val, int[] wt) {
        int n = val.length;
        int[][] dp = new int[n + 1][capacity + 1];

        
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (wt[i - 1] <= w) {
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {
        int capacity = 5;
        int[] val = {10, 40, 30, 50};
        int[] wt = {5, 4, 6, 3};

        int maxVal = knapsack(capacity, val, wt);
        System.out.println( maxVal);
    }
}
