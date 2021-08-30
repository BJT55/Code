public class Solution98 {
    public boolean isValidBST(TreeNode root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean check(TreeNode root,  long lower, long upper) {
        if (root == null) return true;

        if (root.val <= lower || root.val >= upper){
            return false;
        }
        return check(root.left,root.val,lower) &&
                check(root.right,upper,root.val);
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
