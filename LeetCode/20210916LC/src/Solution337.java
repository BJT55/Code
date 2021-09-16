public class Solution337 {
    public int rob(TreeNode root) {
        int[] rootStatus = dfs(root);
        return Math.max(rootStatus[0],rootStatus[1]);
    }

    private int[] dfs(TreeNode node) {
        if (node == null) return new int[]{0,0};

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);
        int selected = node.val + left[1] + right[1];
        int notSelected = Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        return new int[]{selected,notSelected};
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
