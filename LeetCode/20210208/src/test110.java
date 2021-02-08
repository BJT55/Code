//给定一个二叉树，判断它是否是高度平衡的二叉树。
//本题中，一棵高度平衡二叉树定义为：
public class test110 {

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
class Solution110 {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }else return Math.abs(height(root.left) - height(root.right)) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right);
    }
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }else{
            return Math.max(height(root.left),height(root.right)) + 1;
        }
    }
}
*/
