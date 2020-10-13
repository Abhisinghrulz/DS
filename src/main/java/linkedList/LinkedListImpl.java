package linkedList;

public class LinkedListImpl {

    private Node head;

    class Node {
        int data;
        Node next;
    }

    public void insertItem(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
            return;
        }

        Node newNode = head;

        while (newNode.next != null) {
            newNode = newNode.next;
        }

        newNode.next = node;
    }

    public void deleteItem(int data) {
        if (head.data == data) {
            head = head.next;
        }

        Node x = head;
        Node y = head.next;

        while (y != null && y.data != data) {
            x = y;
            y = y.next;
        }

        if (y != null) {
            x.next = y.next;
        } else {
            throw new RuntimeException("Data Not Found to delete");
        }
    }

    public void deleteLastNode() {
        Node x = head;
        Node y = head.next;
        while (y.next != null) {
            x = y;
            y = y.next;
        }

        x.next = null;
    }

    public int lengthOfLinkedList() {
        int len = 0;
        Node n = head;
        while (n != null) {
            n = n.next;
            len++;
        }
        return len;
    }

    public Node reverseLinkedList() {
        Node current = head;
        Node previous = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public int printMiddleElement() {
        Node fastPtr = head;
        Node slowPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr.data;
    }

    void nthElementFromLast(int n) {
        int len = 0;

        Node newNode = head;
        while (newNode != null) {
            newNode = newNode.next;
            len++;
        }


        if (len < n) {
            throw new RuntimeException("N is larger than the LinkedList");
        }

        newNode = head;
        for (int i = 0; i < len - n + 1; i++) {
            newNode = newNode.next;
        }

        System.out.println(newNode.data);

    }

    public LinkedListImpl mergeTwoSortedLinkedList(LinkedListImpl l1, LinkedListImpl l2) {
        LinkedListImpl l3 = new LinkedListImpl();
        Node l1Node = l1.head;
        Node l2Node = l2.head;

        while (l1Node != null || l2Node != null) {
            if (l1Node != null && l2Node != null) {
                if (l1Node.data < l2Node.data) {
                    l3.insertItem(l1Node.data);
                    l1Node = l1Node.next;
                } else {
                    l3.insertItem(l2Node.data);
                    l2Node = l2Node.next;
                }
            }
        }

        if (l1Node != null) {
            l3.insertItem(l1Node.data);
            l1Node = l1Node.next;
        }

        if (l2Node != null) {
            l3.insertItem(l2Node.data);
            l2Node = l2Node.next;
        }

        return l3;

    }

    //Floyd’s Cycle-Finding Algorithm
    public boolean detectLoop(){
        Node slowPtr = head;
        Node fastPtr = head;

        while(slowPtr!=null && fastPtr!=null && fastPtr.next!=null)
        {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr)
            {
                System.out.println("FoundLoop");
                return true;
            }
        }
        return false;
    }
}
