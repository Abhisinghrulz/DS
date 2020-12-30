package leetCode.LinkedList.reverseLLUsingStack;

import leetCode.LinkedList.ListNode;

import java.util.Stack;

public class ReverseList {
    public ListNode reverseList(ListNode head){
        Stack<ListNode> stack = new Stack<>();
        while (head!=null)
        {
            stack.push(head);
            head = head.next;
        }

        ListNode dummy = new ListNode(0);
        head = dummy;

        while (!stack.isEmpty())
        {
            ListNode current = stack.pop();
            head.next = new ListNode(current.val);
            head = head.next;
        }
        return dummy.next;
    }
}
