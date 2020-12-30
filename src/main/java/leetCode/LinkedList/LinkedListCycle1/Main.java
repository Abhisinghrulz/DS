package leetCode.LinkedList.LinkedListCycle1;

import leetCode.LinkedList.ListNode;
import leetCode.LinkedList.removeDuplicates.removeDuplicates2.RemoveDuplicates2;
import leetCode.LinkedList.reverseLLUsingStack.ReverseList;

public class Main {
    public static void main(String[] args) {

        ListNode listNode0 = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(5);

        listNode0.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        RemoveDuplicates2 removeDuplicates2 = new RemoveDuplicates2();
        //ListNode listNodeReturn = removeDuplicates2.deleteDuplicates2(listNode0);
        Main main = new Main();
        //main.showAll(listNodeReturn);
        ReverseList reverseList = new ReverseList();
        ListNode listNode = reverseList.reverseList(listNode0);
        main.showAll(listNode);

    }

    public void showAll(ListNode head)
    {
        while(head!=null)
        {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
