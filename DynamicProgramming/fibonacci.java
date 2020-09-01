package DynamicProgramming;

public class fibonacci {

    int fib(int n) {
        if (memo[n] == -1) {
            int res = 0;
            if (n == 0 || n == 1)
                res = n;
            else
                res = fib(n - 1) + fib(n - 2);
            memo[n] = res;
        }
        return memo[n];
    }

    int nFib(int n) {
        int f[] = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}