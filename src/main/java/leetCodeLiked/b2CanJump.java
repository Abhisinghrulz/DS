package leetCodeLiked;

public class b2CanJump {
    public boolean canJump(int[] nums) {
        int pos = 0;
        int des = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            des = Math.max(des, i + nums[i]);
            if (pos == i) {
                pos = des;
            }

        }

        if (pos < nums.length - 1) {
            return false;
        }

        return true;

    }
}
