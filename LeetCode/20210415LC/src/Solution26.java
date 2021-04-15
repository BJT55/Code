class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null)
            return false;

        return dfs(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }
    public boolean dfs(TreeNode a, TreeNode b){
        if(b == null)
            return true;
        if(a == null || a.val != b.val)
            return false;

        return dfs(a.left,b.left) && dfs(a.right,b.right);
    }
}
