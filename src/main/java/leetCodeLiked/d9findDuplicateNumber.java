package leetCodeLiked;

/**
 * https://www.youtube.com/watch?v=IxI3lArNCN8
 * Approach 3
 */
public class d9findDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];

        while(slow!=fast)
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        fast = 0;

        while(slow!=fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
