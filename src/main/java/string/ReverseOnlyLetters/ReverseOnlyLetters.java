package string.ReverseOnlyLetters;

import java.util.Stack;

public class ReverseOnlyLetters {
    public String reverseOnlyLetter(String s) {
        Stack<Character> letters = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                letters.push(s.charAt(i));
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i)))
            {
                stringBuilder.append(letters.pop());
            }
            else
            {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ReverseOnlyLetters reverseOnlyLetters = new ReverseOnlyLetters();
        String s = reverseOnlyLetters.reverseOnlyLetter("ab-cd");
        System.out.println(s);
    }
}
