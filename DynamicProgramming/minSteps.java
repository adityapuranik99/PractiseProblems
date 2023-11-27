package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class minSteps {

    static int[] dp = new int[1000001];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0){
            Arrays.fill(dp, -1);
            int n = scanner.nextInt();
            System.out.println(minSteps(n));
            t--;
        }
    }

    public static int minSteps(int n){
        if (n <= 1){
            return 0;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE, c = Integer.MAX_VALUE;

        if(n%2 == 0) {
            a = 1+ minSteps(n/2);
        }

        if (n%3 == 0){
            b = 1+ minSteps(n/3);
        }

        c = 1 + minSteps(n - 1);

        dp[n] = Math.min(Math.min(a, b), c);
        return dp[n];
    }
}
