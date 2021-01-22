package leetCodeLiked;

public class e1LengthOfList {
    public int lengthOfLIS(int[] nums) {
        int[] lis = new int[nums.length];

        for (int i = 0; i < lis.length; i++) {
            lis[i] = 1;
        }

        int maxLisLength = 1;

        for (int i = 1; i < lis.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && 1 + lis[j] > lis[i]) {
                    lis[i] = lis[j] + 1;

                    maxLisLength = Math.max(maxLisLength, lis[i]);
                }
            }
        }

        return maxLisLength;
    }
}
