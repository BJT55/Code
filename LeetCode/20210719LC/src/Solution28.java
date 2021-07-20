import sun.reflect.generics.tree.Tree;

public class Solution28 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return dfs(root.left,root.right);
    }
    private boolean dfs(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        return left.val == right.val && dfs(left.left,right.right) && dfs(left.right, right.left);
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
