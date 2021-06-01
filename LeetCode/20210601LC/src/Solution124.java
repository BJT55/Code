
class Solution124 {
    private static int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        getMax(root);
        return res;
    }

    public int getMax(TreeNode root){
        if (root == null){
            return 0;
        }

        int left = Math.max(0, getMax(root.left));
        int right = Math.max(0, getMax(root.right));
        res = Math.max(res, root.val+left+right);
        return Math.max(left,right) + root.val;
    }

    public class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}