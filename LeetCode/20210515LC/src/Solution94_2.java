import java.util.*;

public class Solution94_2 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null){
            return res;
        }
        inorderTraversal(root.left);
        res.add(root.val);
        inorderTraversal(root.right);
        return res;
    }
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(TreeNode left) {
            this.left = left;
        }

        public TreeNode(TreeNode left, TreeNode right) {
            this.left = left;
            this.right = right;
        }
    }
}
