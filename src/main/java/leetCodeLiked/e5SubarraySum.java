package leetCodeLiked;

import java.util.HashMap;

/*
https://www.youtube.com/watch?v=AmlVSNBHzJg&t=15s
  in each iteration store value in the map sum, 1 -> if it doesn't contain
  else sum , map.get(sum) + 1
  And if map.contains(sum - k) -> count = count + map.get(sum-k)
 */
public class e5SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap< Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        e5SubarraySum e5SubarraySum = new e5SubarraySum();
        int [] nums = {1,1,1};
        int k = 2;
        int i = e5SubarraySum.subarraySum(nums, k);
        System.out.println(i);
    }
}
