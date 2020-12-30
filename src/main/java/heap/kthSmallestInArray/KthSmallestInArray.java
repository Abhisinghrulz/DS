package heap.kthSmallestInArray;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestInArray {
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 5, 2, 10};
        KthSmallestInArray kthSmallestInArray = new KthSmallestInArray();
        System.out.println(kthSmallestInArray.findKthSmallest1(arr, 3));
    }

    public int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : nums) {
            minHeap.add(i);
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }

    public int findKthSmallest1(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : nums) {
            minHeap.add(i);
        }
        return minHeap.remove();
    }
}