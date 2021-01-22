package leetCodeLiked;

public class c4PreOrderInOrderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return makeBTree(preorder, inorder, 0, 0, inorder.length-1 );
    }


    public TreeNode makeBTree(int[] preOrder, int[] inOrder, int preStart, int iStart, int iEnd) {
        if (preStart > preOrder.length-1 || iStart > iEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preOrder[preStart]);
        int index = 0;

        for (int i = iStart; i <= iEnd; i++) {
            if (inOrder[i] == root.val) {
                index = i;
            }
        }
        root.left = makeBTree(preOrder, inOrder, preStart + 1, iStart, index - 1);
        root.right = makeBTree(preOrder, inOrder, preStart + index - iStart + 1, index + 1, iEnd);
        return root;
    }



}
