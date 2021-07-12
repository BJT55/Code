import sun.reflect.generics.tree.Tree;

public class JZ18 {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if (pRoot == null){
            return pRoot;
        }
        TreeNode node  = pRoot;
        TreeNode left = Mirror(node.left);
        TreeNode right = Mirror(node.right);
        node.left = right;
        node.right = left;
        return pRoot;
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
