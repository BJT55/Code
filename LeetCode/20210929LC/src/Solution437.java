public class Solution437 {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        int res = getSum(root,targetSum);
        res += pathSum(root.left,targetSum);
        res +=pathSum(root.right,targetSum);
        return res;
    }

    private int getSum(TreeNode root, int targetSum) {
        int res = 0;
        if (root == null) return 0;

        int val = root.val;

        if (val == targetSum){
            res++;
        }

        res += getSum(root.left,targetSum-val);
        res += getSum(root.right,targetSum-val);
        return res;
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
