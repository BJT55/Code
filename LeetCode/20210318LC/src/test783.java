public class test783 {
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

class Solution783 {
    Integer pre,ret;
    public int minDiffInBST(TreeNode root) {
        pre = null;
        ret = Integer.MAX_VALUE;
        dfs(root);
        return ret;
    }
    public void dfs(TreeNode root){
        if (root == null)
            return;

        dfs(root.left);
        if (pre != null){
            ret = Math.min(ret, root.val - pre);
        }
        pre = root.val;
        dfs(root.right);
    }
}