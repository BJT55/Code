public class Solution102 {
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        // write code here
        return dfs(root,o1,o2).val;
    }

    private TreeNode dfs(TreeNode root, int o1, int o2) {
        if (root == null || root.val == o1 || root.val == o2)
            return root;

        TreeNode left = dfs(root.left, o1, o2);
        TreeNode right = dfs(root.right, o1, o2);
        if (left == null)
            return right;
        if (right == null)
            return left;

        return root;
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
