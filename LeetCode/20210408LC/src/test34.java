import java.util.LinkedList;
import java.util.List;

class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        help(root, target);
        return res;
    }
    public void help(TreeNode node, int target){
        if(node == null){
            return;
        }
        list.add(node.val);
        target -= node.val;
        if(target == 0 && node.left == null && node.right == null){
            res.add(new LinkedList(list));
        }else {
            help(node.left, target);
            help(node.right, target);
        }
        list.removeLast();
    }
}