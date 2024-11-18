package DSA_GATE.assignment5;

public class coinChange {
    public static int countRecur(int[] coins, int n, int sum) {

        // If sum is 0 then there is 1 solution
        // (do not include any coin)
        if (sum == 0) return 1;

        // 0 ways in the following two cases
        if (sum < 0 || n == 0) return 0;

        // count is sum of solutions (i)
        // including coins[n-1] (ii) excluding coins[n-1]
        return countRecur(coins, n, sum - coins[n - 1]) +
                countRecur(coins, n - 1, sum);
    }

    public static int count(int[] coins, int sum) {
        return countRecur(coins, coins.length, sum);
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int sum = 5;
        System.out.println(count(coins, sum));
    }
}
