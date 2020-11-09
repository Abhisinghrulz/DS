package linkedList.oddEvenList;

public class OddEvenList {
    public Node oddEvenList(Node head) {
        if (head == null) {
            return null;
        }
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

}
