public class test530 {
}

/*
//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}*/

class Solution530 {
    int pre = -1;
    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return min;
    }
    public void dfs(TreeNode root){
        if (root == null) return;
        dfs(root.left);
        if (pre != -1) {
            min = Math.min(min, root.val - pre);
        }
        pre = root.val;
        dfs(root.right);
    }
}