class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;

        if(root.val > q.val && root.val > p.val)
            return lowestCommonAncestor(root.left,p,q);

        if (root.val < q.val && root.val < p.val)
            return lowestCommonAncestor(root.right,p,q);

        return root;
    }
}