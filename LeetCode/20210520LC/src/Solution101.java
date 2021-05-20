class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return dfs(root,root);
    }
    public boolean dfs(TreeNode left, TreeNode right){
        if (left == null && right == null){
            return true;
        }
        if (left == null || right == null){
            return false;
        }

        if (left.val != right.val){
            return false;
        }
        return dfs(left.left,right.right) && dfs(left.right,right.left);
    }
    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}