package leetCode.LinkedList.LinkedListCycle1;

import leetCode.LinkedList.ListNode;

/**
 * https://leetcode.com/problems/linked-list-cycle/#
 */

public class LinkedList1 {

    public boolean hasCycle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while(slowPointer.next!=null && fastPointer.next!=null && fastPointer.next.next!=null)
        {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer == fastPointer)
            {
                return true;
            }
        }
        return false;
    }
}
