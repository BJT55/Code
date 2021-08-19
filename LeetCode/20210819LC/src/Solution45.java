import java.util.ArrayList;
import java.util.List;

public class Solution45 {
    public int[][] threeOrders (TreeNode root) {
        // write code here
        List<Integer> list = new ArrayList<>();
        dfs(root,list,1);
        dfs(root,list,2);
        dfs(root,list,3);
        int[][] res = new int[3][list.size()/3];
        int index = 0;
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = list.get(index++);
            }
        }
        return res;
    }

    private void dfs(TreeNode node, List<Integer> res, int flag) {
        if (node == null)
            return;
        if (flag == 1)
            res.add(node.val);
        dfs(node.left, res, flag);
        if (flag == 2)
            res.add(node.val);
        dfs(node.right, res, flag);
        if (flag == 3)
            res.add(node.val);
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
