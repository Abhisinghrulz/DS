package misc.generateParnathesis;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenMItheses(int n) {
        List<String> output_arr = new ArrayList<>();
        backtrack(output_arr, "", 0, 0, n);
        return output_arr;
    }

    private void backtrack(List<String> output_arr, String current_str, int open, int close, int max) {
        if (current_str.length() == max * 2) {
            output_arr.add(current_str);
            return;
        }
        if (open < max) backtrack(output_arr, current_str + "(", open + 1, close, max);
        if (close < open) backtrack(output_arr, current_str + ")", open , close+1, max);
    }
}
