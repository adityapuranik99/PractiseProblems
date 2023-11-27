package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class minCoinChange {
    
    static int[] dp = new int[1000001];

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            for(int i = 0; i < t; i++){
                int m = scanner.nextInt();
                int[] coins = new int[m];
                for (int j = 0; j < m; j++) {
                    coins[j] = scanner.nextInt();
                }
                Arrays.fill(dp, -1);
                int n = scanner.nextInt();
                System.out.println(minCoinChange(n, coins));
            }
        }

    

    static int minCoinChange(int n, int[] coins) {

        if (n == 0) {
            return 0;
        }

        if (dp[n]!= -1) {
            return dp[n];
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= n) {
                int subProblem = minCoinChange(n - coins[i], coins);
                if(subProblem != -1){
                    min = Math.min(min, 1 + subProblem);
                }
            }
        }

        dp[n] = (min == Integer.MAX_VALUE)? -1 : min;

        return dp[n];
    }
}
