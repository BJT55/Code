import java.util.ArrayList;
import java.util.List;

public class Solution114 {
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        dfs(root,list);
        for (int i = 1; i < list.size(); i++) {
            TreeNode pre = list.get(i-1), cur = list.get(i);
            pre.left = null;
            pre.right = cur;
        }

    }

    private void dfs(TreeNode root, List<TreeNode> list) {
        if (root == null) return;

        list.add(root);
        dfs(root.left,list);
        dfs(root.right,list);
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
