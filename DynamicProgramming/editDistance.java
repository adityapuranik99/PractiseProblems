package DynamicProgramming;

public class editDistance {
    int eD(String s1, String s2, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[0][i] = i;
        }
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else {
                    int res = (int) Math.max(dp[i - 1][j], dp[i][j - 1]);
                    dp[i][j] = 1 + (int) (Math.min(res, dp[i - 1][j - 1]));
                }
            }
        }
        return dp[m][n];
    }
}