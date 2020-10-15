package bst.misc.bst.bstToSortedLinkedList;

public class BSTApp {

    public static void main(String[] args) {
        BST a = new BST();
        Node root = null;

        root = a.insert(root, 8);
        root = a.insert(root, 15);
        root = a.insert(root, 6);
        root = a.insert(root, 2);
        root = a.insert(root, 7);
        root = a.insert(root, 20);

        a.bstToDoublyLinkedList(root);
        a.printList();

    }

}