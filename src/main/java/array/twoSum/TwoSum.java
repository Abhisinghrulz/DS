package array.twoSum;

//Array is sorted
public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twoSum(numbers, target);
        System.out.println(ints[0] + " "+ ints[1]);
    }

    public int[] twoSum(int[] numbers, int target) {
        int a_pointer = 0;
        int b_pointer = numbers.length - 1;

        while (a_pointer <= b_pointer) {
            int sum = numbers[a_pointer] + numbers[b_pointer];
            if (sum > target) {
                b_pointer--;
            } else if (sum < target) {
                a_pointer++;
            } else {
                return new int[]{a_pointer, b_pointer};
            }
        }
        return new int[]{a_pointer, b_pointer};
    }
}
