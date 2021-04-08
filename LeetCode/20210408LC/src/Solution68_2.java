class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
class Solution68_2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;

        // 若当前递归的 root 为 p 或者 q,则直接返回该节点,即当前节点是最近公共祖先
        if(root == p || root == q)
            return root;

        // 在左子树中找 p q
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        // 在右子树中找 p q
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        if(left == null){
            // 左子树中未找到 p q, p q 都在右子树中
            return right;
        }else if(right == null){
            // 左子树中找到 p q
            return left;
        }

        // 左右子树都不空,证明 p q 在 root 的两侧
        return root;
    }
}