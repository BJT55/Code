import java.util.ArrayList;
import java.util.List;

public class Solution34 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list,target);
        return res;
    }
    private void dfs(TreeNode root , List<Integer> list, int target){
        if(root == null){
            return;
        }

        list.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null){
            res.add(new ArrayList<>(list));
        }else{
            dfs(root.left,list,target);
            dfs(root.right,list,target);
        }
        list.remove(list.size()-1);
    }
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() { }

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
