package bst.makeTree;

public class InorderPreOrderToTree {

    public Node makeBTree(int[] preOrder, int[] inOrder, int preStart, int iStart, int iEnd) {
        if (preStart > preOrder.length-1 || iStart > iEnd) {
            return null;
        }

        Node root = new Node(preOrder[preStart]);
        int index = 0;

        for (int i = iStart; i <= iEnd; i++) {
            if (inOrder[i] == root.data) {
                index = i;
            }
        }
        root.lc = makeBTree(preOrder, inOrder, preStart + 1, iStart, index - 1);
        root.rc = makeBTree(preOrder, inOrder, preStart + index - iStart + 1, index + 1, iEnd);
        return root;
    }

    public void printINORDER(Node root) {
        if (root != null) {
            printINORDER(root.lc);
            System.out.print("  " + root.data);
            printINORDER(root.rc);
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        int[] inOrder = {1, 2, 3, 4, 5, 6, 8};
        int[] preOrder = {4, 2, 1, 3, 6, 5, 8};
        InorderPreOrderToTree i = new InorderPreOrderToTree();
        Node x = i.makeBTree(preOrder, inOrder, 0, 0, inOrder.length - 1);
        System.out.println("inorder traversal of constructed tree : ");
        i.printINORDER(x);

    }
}
