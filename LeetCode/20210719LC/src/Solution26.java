public class Solution26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null){
            return false;
        }
        return dfs(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }
    private boolean dfs(TreeNode A, TreeNode B){
        if(B == null){
            return true;
        }
        if(A == null){
            return false;
        }
        return A.val == B.val && dfs(A.left,B.left) && dfs(A.right,B.right);
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() { }

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
