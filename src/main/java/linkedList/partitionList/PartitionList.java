package linkedList.partitionList;

import linkedList.oddEvenList.Node;

/**
 *https://leetcode.com/problems/partition-list/
 *
 *
 * https://www.youtube.com/watch?v=K5AVJVjdmL0&t=9s
 */
public class PartitionList {
    public Node partitionList(Node head, int x){
        Node beforeHead = new Node(0);
        Node before = beforeHead;
        Node afterHead = new Node(0);
        Node after = afterHead;

        while (head!=null)
        {
            if(head.data<x)
            {
                before.next = head;
                before = before.next;
            }
            else{
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        after.next = null;
        before.next = afterHead.next;
        return head;
    }
}
