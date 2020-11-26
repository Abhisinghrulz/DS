package linkedList.swapNodesInPair;

public class SwapNodesInPair {
    public Node swapPairs(Node head)
    {
        Node temp = new Node(0);
        temp.next = head;
        Node current = temp;

        while (current.next != null && current.next.next!=null)
        {
            Node firstNode = current.next;
            Node secondNode = current.next.next;
            firstNode.next = secondNode.next;
            current.next = secondNode;
            current.next.next = firstNode;
            current = current.next.next;
        }
        return temp.next;


    }
}
