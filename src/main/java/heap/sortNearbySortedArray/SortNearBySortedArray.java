package heap.sortNearbySortedArray;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SortNearBySortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9};
        int k = 3;

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair pair1, Pair pair2) {
                return pair2.getValue().compareTo(pair1.getValue());
            }
        });

        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(new Pair(arr[i], arr[i] - k));
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        while (maxHeap.size() > 0) {
            System.out.println(maxHeap.poll().getKey());
        }
    }

}