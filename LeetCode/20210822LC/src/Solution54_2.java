import java.util.ArrayList;
import java.util.List;

public class Solution54_2 {
    public int kthLargest(TreeNode root, int k){
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        return list.get(list.size()-k);
    }

    private void dfs(TreeNode root, List<Integer> list) {
        if (root == null) return;
        if (root.left != null){
            dfs(root.left,list);
        }
        list.add(root.val);
        if (root.right != null){
            dfs(root.right,list);
        }
    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
