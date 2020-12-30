package leetCode.LinkedList.removeDuplicates.removeDuplicates2;

import leetCode.LinkedList.ListNode;

public class RemoveDuplicates2 {
    public ListNode deleteDuplicates2(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;

        while (prev.next != null && prev.next.next != null) {
            if (prev.next.val == prev.next.next.val) {
                int duplicate = prev.next.val;
                while (prev.next != null && prev.next.val == duplicate) {
                    prev.next = prev.next.next;
                }
            } else {
                prev = prev.next;
            }
        }
        return temp.next;
    }
}
