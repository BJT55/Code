public class Solution06 {
    public int maxPathSum (TreeNode root) {
        // write code here
        if (root == null) return 0;
        return dfs(root);
    }

    private int dfs(TreeNode root) {
        if (root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        return Math.max(left,right) + root.val;
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
