public class Solution54 {
    int res;
    public int kthLargrst(TreeNode root, int k){
        dfs(root,k);
        return res;
    }
    private void dfs(TreeNode node, int k){
        if (node == null){
            return;
        }

        dfs(node.right,k);
        if (--k == 0){
            res = node.val;
        }
        if (k == 0){
            return;
        }

        dfs(node.left,k);
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
