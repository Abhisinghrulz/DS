package leetCodeLiked;

public class a9MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ListNode node = new ListNode(l1.val);
                l3.next = node;
                l1 = l1.next;
            } else {
                ListNode node = new ListNode(l2.val);
                l3.next = node;
                l2 = l2.next;
            }
            l3 = l3.next;
        }

        while (l1 != null) {
            ListNode node = new ListNode(l1.val);
            l3.next = node;
            l1 = l1.next;
            l3 = l3.next;
        }

        while (l2 != null) {
            ListNode node = new ListNode(l2.val);
            l3.next = node;
            l2 = l2.next;
            l3 = l3.next;
        }

        return dummy.next;
    }
}
