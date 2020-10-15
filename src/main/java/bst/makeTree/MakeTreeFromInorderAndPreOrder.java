package bst.makeTree;

/**
 * Inorder : Root Left Right
 * PreOrder : Left Root Right
 * In this question find the first element from the inorder find its index in preOrder.
 * Then all the element to the left of preOrder should be left from the node in inOrder
 */
public class MakeTreeFromInorderAndPreOrder {

    private static int pIndex = 0;

    private Node makeBTree(int[] inOrder, int[] preOrder, int iStart, int iEnd) {
        if (iStart > iEnd) {
            return null;
        }
        Node root = new Node(preOrder[pIndex]);
        pIndex++;

        if (iStart == iEnd) {
            return root;
        }
        int index = getInorderIndex(inOrder, iStart, iEnd, root.data);
        root.left = makeBTree(inOrder, preOrder, iStart, index - 1);
        root.right = makeBTree(inOrder, preOrder, index + 1, iEnd);

        return root;
    }

    private int getInorderIndex(int[] inOrder, int start, int end, int data) {
        for (int i = start; i <= end; i++) {
            if (inOrder[i] == data) {
                return i;
            }
        }
        return -1;
    }

    private void printINORDER(Node root) {
        if (root != null) {
            printINORDER(root.left);
            System.out.print("  " + root.data);
            printINORDER(root.right);
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        int[] inOrder = {2, 5, 6, 10, 12, 14, 15};
        int[] preOrder = {10, 5, 2, 6, 14, 12, 15};
        MakeTreeFromInorderAndPreOrder i = new MakeTreeFromInorderAndPreOrder();
        Node x = i.makeBTree(inOrder, preOrder, 0, inOrder.length - 1);
        System.out.println("Constructed Tree : ");
        i.printINORDER(x);
    }


    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

    }


}
