public class Solution55_2 {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }else {
            return Math.abs(height(root.left)-height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private int height(TreeNode node) {
        if (node == null){
            return 0;
        }else {
            return Math.max(height(node.left),height(node.right)) +1;
        }

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
