package misc.groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * https://www.youtube.com/watch?v=ptgykfAEax8&list=PLi9RQVmJD2fb6YDvgO2jXyIoab1FjZalf&index=4
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        String[] s = {"eat", "tea", "ate", "tan", "nat", "bat"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        System.out.println(groupAnagrams.groupAnagrams(s));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupAnagrams = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String current : strs) {
            char[] charArray = current.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(current);
        }
        groupAnagrams.addAll(map.values());
        return groupAnagrams;
    }

}
