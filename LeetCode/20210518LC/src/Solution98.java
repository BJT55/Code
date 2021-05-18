class Solution98 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode root, long left, long right) {
        if (root == null){
            return true;
        }
        if (root.val <= left || root.val >= right){
            return false;
        }
        return isValidBST(root.left,left,root.val) && isValidBST(root.right,root.val,right);
    }

    static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }
}