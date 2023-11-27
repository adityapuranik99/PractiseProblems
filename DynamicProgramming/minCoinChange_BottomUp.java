package DynamicProgramming;

import java.util.Scanner;
import java.util.Arrays;

public class minCoinChange_BottomUp {
    
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            for(int i = 0; i < t; i++){
                int m = scanner.nextInt();
                int[] coins = new int[m];
                for (int j = 0; j < m; j++) {
                    coins[j] = scanner.nextInt();
                }
                int n = scanner.nextInt();
                System.out.println(minCoinChange(n, coins));
            }
        }

    
    static int minCoinChange(int n, int[] coins){
        int[] dp = new int[n+1];
        Arrays.fill(dp, n+1);
        dp[0] = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < coins.length; j++){
                if(coins[j] <= i){
                    dp[i] = Math.min(dp[i], 1 + dp[i-coins[j]]);
                }
            }
        }

        return (dp[n] > n+1) ? -1 : dp[n];
    }
}
