package leetCodeLiked;

public class e8EqualSumPartititon {
    public boolean canPartition(int[] nums) {
        // s1 + s2 = sum
        // 2s1 = sum
        int sum = 0;

        for(int i =0; i<nums.length; i++)
        {
            sum = sum + nums[i];
        }

        if(sum%2!=0)
        {
            return false;
        }

        return findSubset(nums, nums.length, sum/2);
    }

    private boolean findSubset(int[] arr, int n, int sum) {
        boolean dp[][] = new boolean[n + 1][sum + 1];

        // If sum is 0, then answer is true
        for (int i = 1; i <= sum; i++)
            dp[0][i] = false;

        // If sum is not 0 and set is empty,
        // then answer is false
        for (int i = 0; i <= n; i++)
            dp[i][0] = true;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
