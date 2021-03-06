package leetCodeLiked;

import java.util.Arrays;

/**
 * https://www.youtube.com/watch?v=K715avFmZIk
 */
public class d7NumSquares {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return f(n, dp);
    }

    int f(int n, int[] dp) {
        if (dp[n] != -1) {
            return dp[n];
        }

        if (n == 0) {
            return 0;
        }

        int min = Integer.MAX_VALUE;

        for (int i = 1; i * i <= n; i++) {
            int curr = f(n - i * i, dp) + 1;
            min = Math.min(min, curr);
        }
        return min;
    }
}
