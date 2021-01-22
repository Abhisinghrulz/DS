package leetCodeLiked;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class d1MajorityElement {
    public int majorityElement(int[] nums) {
        if(nums.length == 1)
        {
            return nums[0];
        }

        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i : nums)
        {
            if(map.containsKey(i))
            {
                map.put(i, map.get(i) + 1);
                if(map.get(i)> nums.length/2){return i;}
            }
            else{
                map.put(i,1);
            }
        }
        return -1;
    }
}
