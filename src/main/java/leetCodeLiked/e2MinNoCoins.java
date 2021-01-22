package leetCodeLiked;

public class e2MinNoCoins {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n + 1][amount + 1];

        // If sum is 0, then answer is true
        for (int i = 0; i <= amount; i++)
            dp[0][i] = Integer.MAX_VALUE-1;

        // If sum is not 0 and set is empty,
        // then answer is false
        for (int i = 1; i <= n; i++)
            dp[i][0] = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(1 + dp[i][j - coins[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        if(dp[n][amount] == Integer.MAX_VALUE -1)
        {
            return -1;
        }
        return dp[n][amount];
    }
}
