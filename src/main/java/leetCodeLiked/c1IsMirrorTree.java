package leetCodeLiked;

public class c1IsMirrorTree {

    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        if(root.left == null && root.right == null)
        {
            return true;
        }
        return isMirrorTree(root.left, root.right);
    }

    public boolean isMirrorTree(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null)
        {
            return true;
        }

        if(node1 == null || node2 ==null)
        {
            return false;
        }

        return node1.val == node2.val
                && isMirrorTree(node1.left, node2.right)
                && isMirrorTree(node1.right, node2.left);
    }
}
