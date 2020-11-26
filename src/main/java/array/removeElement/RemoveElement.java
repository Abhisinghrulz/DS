package array.removeElement;

//https://leetcode.com/problems/remove-element/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int validSize = 0;
        for(int i=0 ; i<nums.length; i++)
        {
            if(nums[i]!=val)
            {
                nums[validSize] = nums[i];
                validSize++;
            }
        }
        return validSize;
    }

    public static void main(String[] args) {
        int [] nums = {3,2,2,3};
        int val = 3;
        RemoveElement removeElement = new RemoveElement();
        int i = removeElement.removeElement(nums, 3);
        System.out.println(i);
    }
}
