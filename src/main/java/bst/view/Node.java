package bst.view;

class Node {
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node lc, rc; //left and right references

    // Constructor of tree node
    public Node(int key) {
        data = key;
        hd = Integer.MAX_VALUE;
        lc = rc = null;
    }
}