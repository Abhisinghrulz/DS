package bst.createBst.createBSTFromPreOrder;

public class BSTApp {

    public static void main(String[] args) {
        BST a = new BST();

        Node root = null;

        int[] preOrder = {10, 4, 2, 8, 5, 9, 15, 12, 20};

        root = a.createBST(preOrder, 0, preOrder.length - 1);

    }

}