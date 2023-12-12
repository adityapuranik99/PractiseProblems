package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class frogJump_BottomUp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] jumps = new int[t];
        for(int i = 0; i < t; i++){
            jumps[i] = scanner.nextInt();
        }
        System.out.println(minJumps(t, jumps));
    }    
    

    static int minJumps(int n, int[] jumps){
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i < n; i++){
            dp[i] = Math.min((Math.abs(jumps[i] - jumps[i-1]) + dp[i-1]), (Math.abs(jumps[i] - jumps[i-2]) + dp[i-2]));
        }

        return dp[n];
    }
}
