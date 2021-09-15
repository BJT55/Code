import java.util.HashMap;
import java.util.Map;

public class Solution337 {
    Map<TreeNode, Integer> map1 = new HashMap<>();
    Map<TreeNode, Integer> map2 = new HashMap<>();
    public int rob(TreeNode root) {
        dfs(root);
        return Math.max(map1.getOrDefault(root,0), map2.getOrDefault(root,0));
    }

    private void dfs(TreeNode node) {
        if (node == null) return;

        dfs(node.left);
        dfs(node.right);
        map1.put(node, node.val+map2.getOrDefault(node.left,0)+map2.getOrDefault(node.right,0) );
        map2.put(node, node.val+map1.getOrDefault(node.left,0)+map1.getOrDefault(node.right,0) );

    }


    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
