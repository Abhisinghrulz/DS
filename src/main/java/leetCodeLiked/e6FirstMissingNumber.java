package leetCodeLiked;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class e6FirstMissingNumber {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
        HashSet<Integer> numbers = new HashSet<>();

        for (int i : nums) {
            numbers.add(i);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!numbers.contains(i)) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;

    }
}
