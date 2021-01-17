package leetCodeLiked;

import java.util.Stack;

public class a8ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char poped = stack.pop();

                if (c == ')' && poped != '(') {
                    return false;
                }

                if (c == ']' && poped != '[') {
                    return false;
                }

                if (c == '}' && poped != '{') {
                    return false;
                }
            }

        }

        if (!stack.isEmpty()) {
            return false;
        }

        return true;
    }
}
