class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
class Solution26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null)
            return false;

        return dfs(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }
    public boolean dfs(TreeNode A, TreeNode B){
        if(B == null)
            return true;
        if(A == null || A.val != B.val)
            return false;
        return dfs(A.left,B.left) && dfs(A.right, B.right);
    }
}