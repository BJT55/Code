import java.util.ArrayDeque;
import java.util.Deque;

public class Solution99 {
    public void recoverTree(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode x = null, y = null, pre = null;

        while ( !stack.isEmpty() || root != null){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pre != null && root.val < pre.val){
                y = root;
                if (x == null){
                    x = pre;
                }else {
                    break;
                }
            }
            pre = root;
            root = root.right;
        }
        swap(x,y);
    }
    private void swap(TreeNode x, TreeNode y){
        int tmp = x.val;
        x.val = y.val;
        y.val = tmp;
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
