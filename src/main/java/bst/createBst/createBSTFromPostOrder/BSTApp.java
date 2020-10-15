package bst.createBst.createBSTFromPostOrder;

public class BSTApp {

    public static void main(String[] args) {
        BST a = new BST();

        Node root = null;

        int[] postOrder = {2, 5, 9, 8, 4, 12, 20, 15, 10};

        root = a.createBST(postOrder, 0, postOrder.length - 1);

        a.inorder(root);

    }

}