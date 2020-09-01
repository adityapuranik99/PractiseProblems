package DynamicProgramming;

public class countCoins {

    int getCount(int[] coins, int n, int sum) {
        if (sum == 0)
            return 1;
        if (n == 0)
            return 0;
        int res = getCount(coins, n - 1, sum);
        if (coins[n - 1] <= sum)
            res = res + getCount(coins, n, sum - coins[n - 1]);
        return res;
    }

    int getCountTabu(int[] coins, int n, int sum) {
        int[][] dp = new int[sum + 1][n + 1];
        for (int i = 0; i <= n; i++)
            dp[0][i] = 1;
        for (int i = 1; i <= sum; i++)
            dp[i][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                dp[i][j] = dp[i][j - 1];
                if (coins[j - 1] <= i) {
                    dp[i][j] += dp[i - coins[j - 1]][i];
                }
            }
        }
        return dp[sum][n];
    }
}