//将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
//本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
public class test108 {

}
/*
//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return func(nums,0,nums.length - 1);
    }
    public TreeNode func(int[] nums, int left, int right){
        if(left > right){
            return null;
        }
        int mid = (left + right)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = func(nums,left,mid - 1);
        node.right = func(nums,mid + 1, right);
        return node;
    }
}*/
