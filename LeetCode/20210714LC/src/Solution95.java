import java.util.LinkedList;
import java.util.List;

public class Solution95 {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0){
            return new LinkedList<>();
        }
        return generateTrees(1,n);
    }

    private List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> allTrees = new LinkedList<>();
        if (start > end){
            allTrees.add(null);
            return allTrees;
        }

        for (int i = start; i <= end; ++i){
            List<TreeNode> leftTree = generateTrees(start,i-1);
            List<TreeNode> rightTree = generateTrees(i-1,end);

            for (TreeNode left : leftTree){
                for (TreeNode right : rightTree){
                    TreeNode cur = new TreeNode(i);
                    cur.left = left;
                    cur.right = right;
                    allTrees.add(cur);
                }
            }
        }
        return allTrees;
    }

    class TreeNode{
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
