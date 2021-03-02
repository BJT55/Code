import java.util.Map;

public class test543 {
}

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return max;
    }
    public int depth(TreeNode node) {
        if (node == null) return 0;
        int left = depth(node.left);
        int right = depth(node.right);
        max = Math.max(left + right,max);
        return Math.max(left,right) + 1;
    }
}