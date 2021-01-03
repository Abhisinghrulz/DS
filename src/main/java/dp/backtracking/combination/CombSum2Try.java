package dp.backtracking.combination;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import java.util.stream.Collectors;
/*
Wrong answer
 */
class CombSum2Try {

    List<List<Integer>> result;

    public static void main(String[] args) {
        CombSum2Try combSum2Try = new CombSum2Try();
        List<List<Integer>> lists = combSum2Try.combinationSum(new int[]{2, 3, 6, 7}, 7);
        System.out.println(lists);
    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        result = new ArrayList<>();
        combination(candidates, new HashSet(), 0, target);

        return result;
    }

    public void combination(int [] input, HashSet<Integer> partial, int i , int target){
        if(partial.stream().mapToInt(a -> a).sum() == target)
        {
            List<Integer> aList = new ArrayList<>(partial);
            result.add(aList);
            return;
        }

        if(i == input.length)
        {
            return;
        }

        partial.add(input[i]);
        combination(input, partial, i+1, target);
        partial.remove(input[i]);
        combination(input, partial, i+1, target);

    }


}