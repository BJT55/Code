//翻转二叉树
public class test226 {

}


//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode rightTree = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(rightTree);
        return root;
    }
}