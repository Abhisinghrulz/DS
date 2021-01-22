package leetCodeLiked;

public class d8MoveZeroes {
    public void moveZeroes(int[] nums) {
        int counter = 0;
        int temp = 0;
        for(int i =0; i<nums.length; i++)
        {
            if(nums[i] != 0)
            {
                // swap(nums[i], nums[counter])
                temp = nums[i];
                nums[i] = nums[counter];
                nums[counter] = temp;
                counter++;
            }
        }


    }
}
