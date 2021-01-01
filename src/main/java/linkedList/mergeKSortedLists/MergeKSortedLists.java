package linkedList.mergeKSortedLists;

import leetCode.LinkedList.ListNode;

import java.util.PriorityQueue;

class Solution {

    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(ListNode head : lists)
        {
            while(head!=null)
            {
                minHeap.add(head.val);
                head = head.next;
            }

        }

        ListNode temp = new ListNode(0);
        ListNode head = temp;

        while(!minHeap.isEmpty())
        {
            head.next = new ListNode(minHeap.remove());
            head = head.next;
        }

        return temp.next;

    }
}