package bst;

public class Bst2 {

    Node root;

    public class Node {
        Node lc;
        Node rc;
        int data;
    }

    public void insertItem(int data) {

        Node newNode = new Node();
        newNode.lc = null;
        newNode.rc = null;
        newNode.data = data;

        if (root == null) {
            root = newNode;
            return;
        }

        Node p = root;
        Node c = root;

        while (c != null) {
            p = c;
            if (data < c.data) {
                c = c.lc;
            } else {
                c = c.rc;
            }
        }

        if (data < p.data) {
            p.lc = newNode;
        } else {
            p.rc = newNode;
        }
    }

    //Objective: – Given a inorder and level order traversal, construct a binary tree from that.


}
