class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
class Solution28 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return dfs(root.left, root.right);
    }
    public boolean dfs(TreeNode r1, TreeNode r2){
        if(r1 == null && r2 == null)
            return true;
        if(r1 == null || r2 == null)
            return false;
        if(r1.val != r2.val)
            return false;
        return dfs(r1.left, r2.right) && dfs(r1.right, r2.left);
    }
}