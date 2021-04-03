class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
class Solution54 {
    private int res = 0, count = 0;
    public int kthLargest(TreeNode root, int k) {
        helper(root,k);
        return res;
    }
    public void helper(TreeNode root, int k){
        if(root == null){
            return ;
        }
        helper(root.right,k);
        if(++count == k){
            res = root.val;
        }
        helper(root.left,k);
    }
}

class Solution55_1 {
    public int maxDepth(TreeNode root) {
        return helper(root);
    }
    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(helper(root.left), helper(root.right)) + 1;
    }
}

class Solution55_2 {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        return Math.abs(dfs(root.left) - dfs(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(dfs(root.left), dfs(root.right))+1;
    }
}