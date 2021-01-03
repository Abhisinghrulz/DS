package dp.backtracking.combination;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

class Solution {

    List<List<Integer>> result;

    public List<List<Integer>> combine(int n, int k) {

        result = new ArrayList();

        int [] arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = i+1;
        }
        combination(arr, new HashSet(), 0, k);

        return result;
    }

    public void combination(int [] input, HashSet<Integer> partial, int i , int k){
        if(partial.size() == k)
        {
            List<Integer> aList = partial.stream().collect(Collectors.toList());
            result.add(aList);
            return;
        }

        if(i == input.length)
        {
            return;
        }

        partial.add(input[i]);
        combination(input, partial, i+1, k);
        partial.remove(input[i]);
        combination(input, partial, i+1, k);

    }
}