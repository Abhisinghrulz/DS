package leetCode.map.groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> lists = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(lists);
    }

    public List<List<String>> groupAnagrams(String [] strs){
        List<List<String>> groupAnagrams = new ArrayList<>();
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for(String current : strs)
        {
            char[] characters = current.toCharArray();
            Arrays.sort(characters);
            String sorted = new String(characters);
            if(!hashMap.containsKey(sorted))
            {
                hashMap.put(sorted, new ArrayList<>());
            }
            hashMap.get(sorted).add(current);
        }
        groupAnagrams.addAll(hashMap.values());
        return groupAnagrams;
    }
}
