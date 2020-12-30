package leetCode.LinkedList.LinkedListCycle1;

import leetCode.LinkedList.ListNode;

/**
 * https://leetcode.com/problems/linked-list-cycle-ii/
 */

public class LinkedList2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while(slowPointer.next!=null && fastPointer.next!=null && fastPointer.next.next!=null)
        {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer == fastPointer)
            {
                break;
            }
        }
        if(fastPointer==null && fastPointer.next==null) {
            return null;
        }
        fastPointer = head;
        while(fastPointer!=slowPointer)
        {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        return fastPointer;
    }
}
