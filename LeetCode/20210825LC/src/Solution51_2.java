public class Solution51_2 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        else
            return isBalanced(root.left) && isBalanced(root.right)
                   && Math.abs(height(root.left)-height(root.right)) <= 1;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;
        return Math.max(height(node.left),height(node.right))+1;
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
