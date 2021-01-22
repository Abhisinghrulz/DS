package leetCodeLiked;

public class e4DiameterOfBinaryTree {
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        getDiameter(root);
        return ans== 0?0:ans- 1;
    }

    public int getDiameter(TreeNode root){
        if(root == null)
        {
            return 0;
        }
        int l = getDiameter(root.left);
        int r = getDiameter(root.right);
        ans = Math.max(ans, l+r+1);
        return Math.max(l,r)+1;
    }
}
