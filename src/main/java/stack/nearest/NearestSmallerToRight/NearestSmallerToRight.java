package stack.nearest.NearestSmallerToRight;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestSmallerToRight {

    private List<Integer> nearestSmallerToRight(int[] arr) {

        List<Integer> resultList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                resultList.add(-1);
            } else if (stack.peek() < arr[i]) {
                resultList.add(stack.peek());
            } else if (stack.peek() >= arr[i]) {
                while (stack.size() > 0 && stack.peek() >= arr[i]) {
                    stack.pop();
                }
                if (stack.size() == 0) {
                    resultList.add(-1);
                } else {
                    resultList.add(stack.peek());
                }
            }
            stack.push(arr[i]);


        }
        return resultList;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        NearestSmallerToRight nearestSmallerToRight = new NearestSmallerToRight();
        List<Integer> nextGreaterToRight1 = nearestSmallerToRight.nearestSmallerToRight(arr);
        System.out.println(nextGreaterToRight1);
        for (int i = nextGreaterToRight1.size() - 1; i >= 0; i--) {
            System.out.println(nextGreaterToRight1.get(i));
        }
    }


}
