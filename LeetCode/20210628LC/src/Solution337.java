import java.util.HashMap;
import java.util.Map;

class Solution337 {
    Map<TreeNode,Integer> choose = new HashMap<>();
    Map<TreeNode,Integer> noChoose = new HashMap<>();
    public int rob(TreeNode root) {
        dfs(root);
        return Math.max(choose.getOrDefault(root,0),noChoose.getOrDefault(root,0));
    }

    private void dfs(TreeNode node) {
        if (node == null){
            return;
        }
        dfs(node.left);
        dfs(node.right);
        choose.put(node,node.val + noChoose.getOrDefault(node.left,0)+ noChoose.getOrDefault(node.right,0));
        noChoose.put(node,Math.max(choose.getOrDefault(node.left,0),noChoose.getOrDefault(node.left,0)) + Math.max(choose.getOrDefault(node.right,0) ,noChoose.getOrDefault(node.right,0)));
    }

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(){}
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