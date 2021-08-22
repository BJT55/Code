import java.util.ArrayList;
import java.util.List;

public class Solution34 {
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(root,res,list,target);
        return res;
    }

    private void dfs(TreeNode root, List<List<Integer>> res, List<Integer> list, int target) {
        if (root == null) return;

        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(list));
        }else {
            dfs(root.left, res, list, target);
            dfs(root.right, res, list, target);
        }
        list.remove(list.size()-1);
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