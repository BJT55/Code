
public class Solution28 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return dfs(root.left,root.right);
    }
    public boolean dfs(TreeNode l,TreeNode r){
        if(l == null && r == null){
            return true;
        }
        if(l == null || r == null){
            return false;
        }
        return l.val == r.val && dfs(l.left,r.right) && dfs(l.right,r.left);
    }

}