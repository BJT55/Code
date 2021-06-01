import java.util.ArrayList;
import java.util.List;

public class Solution103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        traversal(root,res,0);
        return res;
    }
    public void traversal(TreeNode root, List<List<Integer>> res, int level){
        if (root == null){
            return;
        }

        if (res.size() == level){
            res.add(new ArrayList<>());
        }

        if ((level&1) == 1){
            res.get(level).add(0,root.val);
        }else {
            res.get(level).add(root.val);
        }
        traversal(root.left,res,level+1);
        traversal(root.right,res,level+1);
    }

    public class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
