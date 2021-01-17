package leetCodeLiked;

import java.util.*;

public class a6ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new LinkedHashSet<>();

        int l, r;

        /* Sort the elements */
        Arrays.sort(nums);
        /* Now fix the first element one by one and find the
           other two elements */
        for (int i = 0; i < nums.length - 2; i++) {

            // To find the other two elements, start two index variables
            // from two corners of the array and move them toward each
            // other
            l = i + 1; // index of the first element in the remaining elements
            r = nums.length - 1; // index of the last element
            while (l < r) {
                List<Integer> temp = new LinkedList<>();
                if (nums[i] + nums[l] + nums[r] == 0) {
                    //System.out.print("Triplet is " + nums[i] + ", " + nums[l] + ", " + nums[r]);
                    temp.add(nums[i]);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    result.add(temp);
                    while (l < r && nums[l] == nums[l+1]) {l++;}
                    while (l < r && nums[r] == nums[r-1]) {r--;}

                    l++;
                    r--;
                }
                else if (nums[i] + nums[l] + nums[r] < 0)
                    l++;

                else // A[i] + A[l] + A[r] > sum
                    r--;
            }
        }

        // If we reach here, then no triplet was found
        List<List<Integer>> output = new LinkedList<>(result);
        return output;
    }
}
