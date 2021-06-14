import java.util.ArrayList;

class Solution230 {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> nums = help(root,new ArrayList<Integer>());
        return nums.get(k-1);
    }

    private ArrayList<Integer> help(TreeNode root, ArrayList<Integer> list) {
        if (root == null){
            return list;
        }
        help(root.left,list);
        list.add(root.val);
        help(root.right,list);
        return list;
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