import sun.reflect.generics.tree.Tree;

public class JZ17 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null){
            return false;
        }
        if (root2 == null){
            return false;
        }

        return check(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }
    public boolean check(TreeNode root1, TreeNode root2){
        if (root2 == null){
            return true;
        }
        if (root1 == null || root1.val != root2.val){
            return false;
        }
        return check(root1.left,root2.left) && check(root1.right,root2.right);
    }
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

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
