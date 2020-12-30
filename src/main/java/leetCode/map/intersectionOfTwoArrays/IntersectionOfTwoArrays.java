package leetCode.map.intersectionOfTwoArrays;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] num1, int[] num2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : num1) {
            set.add(i);
        }

        HashSet<Integer> intersection = new HashSet<>();
        for (int i : num2) {
            if (set.contains(i)) {
                intersection.add(i);
            }
        }

        int[] result = new int[intersection.size()];
        int index = 0;
        for (int i : intersection) {
            result[index++] = i;
        }
        return result;
    }
}
