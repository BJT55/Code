public class Solution26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        return dfs(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }

    private boolean dfs(TreeNode a, TreeNode b) {
        if (b == null) return true;
        if (a == null) return false;
        return a.val == b.val && dfs(a.left,b.left) && dfs(a.right,b.right);
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
