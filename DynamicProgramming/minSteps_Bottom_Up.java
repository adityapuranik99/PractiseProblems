package DynamicProgramming;

import java.util.Scanner;

public class minSteps_Bottom_Up {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++){
            int n = scanner.nextInt();
            System.out.println(minSteps(n));
        }
    }


    public static int minSteps(int n){

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;


        for (int i = 4; i <= n; i++) { 
            int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE, c = Integer.MAX_VALUE;

            if(i%2 == 0) {
                a = 1+ dp[i/2];
            }
            if(i%3 ==0){
                b = 1 + dp[i/3];
            }
            c = 1 + dp[i-1];

            dp[i] = Math.min(Math.min(a, b), c);
        }

        return dp[n];        
    }
}
