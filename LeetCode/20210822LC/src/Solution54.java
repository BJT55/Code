public class Solution54 {
    int res;
    int k;
    public int kthLargest(TreeNode root, int k){
        this.k = k;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null){
            return;
        }

        dfs(root.right);
        if (k == 0) return;
        if (--k == 0) res = root.val;
        dfs(root.left);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
