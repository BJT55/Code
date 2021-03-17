public class test104 {
}

/*class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}*/
/*
class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        return check(root.left, root.right);
    }
    public boolean check(TreeNode l, TreeNode r){
        if (l == null && r == null)
            return true;
        if (l == null || r == null)
            return false;
        if (l.val != r.val)
            return false;
        return check(l.left,r.right) && check(l.right,r.left);
    }
}*/
/*
class Solution110 {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        else
            return isBalanced(root.left) && isBalanced(root.right)
            && Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1;
    }
    public int getHeight(TreeNode root){
        if (root == null)
            return 0;
        else
            return 1 + Math.max(getHeight(root.left),getHeight(root.right));
    }
}*/

/*
class Solution104{
    public int treeDepth(TreeNode root) {
        if(root == null)
            return 0;

        return 1 + treeDepth(root.left) + treeDepth(root.right);
    }
}*/
