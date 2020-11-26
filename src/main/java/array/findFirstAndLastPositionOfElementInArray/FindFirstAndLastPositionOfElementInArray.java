package array.findFirstAndLastPositionOfElementInArray;

public class FindFirstAndLastPositionOfElementInArray {
    public static void main(String[] args) {
        int[] num = {5, 7, 7, 8, 8, 10};
        int target = 8;
        FindFirstAndLastPositionOfElementInArray findFirstAndLastPositionOfElementInArray = new FindFirstAndLastPositionOfElementInArray();
        int[] ints = findFirstAndLastPositionOfElementInArray.searchRange(num, target);
        System.out.println(ints[0] + " " + ints[1]);
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findStartingIndex(nums, target);
        result[1] = findEndingIndex(nums, target);
        return result;
    }

    private int findStartingIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int midpoint = start + (end - start) / 2;
            if (nums[midpoint] >= target) {
                end = midpoint - 1;
            } else {
                start = midpoint + 1;
            }
            if (nums[midpoint] == target) {
                index = midpoint;
            }
        }
        return index;
    }

    private int findEndingIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int midpoint = start + (end - start) / 2;
            if (nums[midpoint] <= target) {
                start = midpoint + 1;
            } else {
                end = midpoint - 1;
            }
            if (nums[midpoint] == target) {
                index = midpoint;
            }
        }
        return index;
    }
}
