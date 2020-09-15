package stack.misc;

import java.util.Stack;

public class StackSort {

    public static Stack<Integer> sortStack(Stack<Integer> input) {
        Stack<Integer> tmpStack = new Stack<>();
        while (!input.isEmpty()) {
            int tmp = input.pop();
            System.out.println("Element taken out : " + tmp);
            while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
                input.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
            System.out.println("Input : " + input);
            System.out.println("TmpStack : " + tmpStack);
        }
        return tmpStack;
    }

    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        input.add(34);
        input.add(2);
        input.add(14);
        input.add(54);
        input.add(4);
        System.out.println("Final Sorted List : "+ sortStack(input));

    }
}
