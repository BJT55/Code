import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution32_22 {
    private List<List<Integer>> res;
    public List<List<Integer>> levelOrder(TreeNode root) {
       res = new ArrayList<>();
       dfs(0,root);
       return res;
    }

    private void dfs(int depth, TreeNode root) {
        if (root == null) return;

        if (res.size() == depth){
            res.add(new ArrayList<>());
        }

        res.get(depth).add(root.val);
        dfs(depth+1,root.left);
        dfs(depth+1,root.right);
    }


    class TreeNode {
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
