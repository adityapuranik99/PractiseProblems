package DynamicProgramming;

import java.util.Scanner;
import java.util.Arrays;

public class wineSelling_BottomUp {
    
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            for(int i = 0; i < t; i++){
                int n = scanner.nextInt();
                int[] prices = new int[n];
                for(int j = 0; j < n; j++){
                    prices[j] = scanner.nextInt();
                }
                System.out.println(maxProfit(prices, 0, n-1));
            }
        }

    static int maxProfit(int[] prices, int i, int j){

        int n = prices.length;
        int[][] dp = new int[n][n];
        
        for (int k = 0; k < dp.length; k++){
            for (int l = 0; l < dp[k].length; l++){
                if (k > l){
                    dp[k][l] = 0;
                }
                if (k == l){
                    dp[k][l] = n * prices[k];
                }
            }
        }

        
        for (int k = 0; k < dp.length; k++){
            for (int l = 0; l < dp[k].length; l++){
                if (k < l && (k != i ||  l !=j)){
                    int a = ((n - (l - k)) * prices[k] )+ dp[k+1][l];
                    int b = ((n - (l - k)) * prices[l]) + dp[k][l-1];
                    dp[k][l] = Math.max( a, b);
                }
            }
        }

        dp[i][j] = Math.max((prices[j] + dp[i][j-1]), (prices[i] + dp[i+1][j]));

        return dp[i][j];
    }
}
