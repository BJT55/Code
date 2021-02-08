//
public class test111 {

}
/*
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
class Solution111 {
    public int minDepth(TreeNode root) {
        if(root == null)    return 0;
        else if(root.left == null)  return minDepth(root.right) + 1;
        else if(root.right == null) return minDepth(root.left) + 1;
        else return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
    }
}*/
