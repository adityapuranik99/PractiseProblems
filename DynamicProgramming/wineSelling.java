package DynamicProgramming;

import java.util.Scanner;
import java.util.Arrays;

public class wineSelling {

    static int[][] dp = new int[1001][1001];
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            for(int i = 0; i < t; i++){
                int n = scanner.nextInt();
                int[] prices = new int[n];
                for(int j = 0; j < n; j++) {
                    prices[j] = scanner.nextInt();
                }
                for (int[] row: dp)
                    Arrays.fill(row, -1);
                System.out.println(maxProfit(prices, 0, n-1));
            }
        }

    

    static int maxProfit(int[] prices, int i, int j) {
        int y = prices.length - (j - i);
        if(i > j) {
            return 0;
        }

        if (dp[i][j]!= -1) {
            return dp[i][j];
        }

        int profit = 0;

        profit = Math.max(prices[i] * y + maxProfit(prices, i+1, j), prices[j] * y + maxProfit(prices, i, j-1));

        return profit;
    }
}
