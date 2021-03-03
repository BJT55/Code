public class test543 {
}

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

/*
class Solution543 {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }
    public int depth(TreeNode node){
        if (node == null) return 0;
        int left = depth(node.left);
        int right = depth(node.right);
        max = Math.max(left+right,max);
        return Math.max(left,right) + 1;
    }
}*/

class Solution543 {
    int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        depth(root);
        return d-1;
    }

    public int depth(TreeNode node){
        if(node==null) return 0;
        int ld=depth(node.left);
        int rd=depth(node.right);
        d=Math.max(d,ld+rd+1);
        return Math.max(ld,rd)+1;
    }
}