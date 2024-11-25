package DSA_GATE.Assignment6;

public class editDistance {
    public static int minDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        
        int[][] dp = new int[2][n + 1];
        
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }
        
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0) {
                    dp[i % 2][j] = i;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i % 2][j] = dp[(i - 1) % 2][j - 1];
                } else {
                    dp[i % 2][j] = 1 + Math.min(dp[(i - 1) % 2][j],
                                   Math.min(dp[i % 2][j - 1], 
                                            dp[(i - 1) % 2][j - 1]));
                }
            }
        }
        
        return dp[m % 2][n];
    }

    public static void main(String[] args) {
        String s1 = "GEEXSFRGEEKKS", s2 = "GEEKSFORGEEKS";
        System.out.println(minDistance(s1, s2));
    }
}
