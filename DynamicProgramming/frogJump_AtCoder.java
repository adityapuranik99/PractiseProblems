package DynamicProgramming;

import java.util.Scanner;
import java.util.Arrays;

public class frogJump_AtCoder {

    static int[] dp = new int[100001];
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            int[] jumps = new int[t];
            for(int i = 0; i < t; i++){
                jumps[i] = scanner.nextInt();
            }
            Arrays.fill(dp, -1);
            System.out.println(minJumps(t-1, jumps));
        }      
    
    static int minJumps(int n, int[] jumps){

        if (n == 0){
            return 0;
        }

        if (n == 1){
            return (Math.abs(jumps[n] - jumps[n-1]) + minJumps(n-1, jumps));
        }

        if (dp[n] != -1){
            return dp[n];
        }

        int cost = Math.min((Math.abs(jumps[n] - jumps[n-1]) + minJumps(n-1, jumps)), (Math.abs(jumps[n] - jumps[n-2]) + minJumps(n-2, jumps)));

        dp[n] = cost;
        return dp[n];
    }

}
