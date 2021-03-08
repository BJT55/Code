public class test606 {
}


/*
//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}*/

/*
// 递归：
class Solution606 {
    public String tree2str(TreeNode t) {
        if(t == null)
            return "";
        if(t.left == null && t.right == null)
            return t.val + "";
        if(t.right == null)
            return t.val + "(" + tree2str(t.left) + ")";
        return t.val + "(" + tree2str(t.left)+ ")" + "(" + tree2str(t.right) + ")";
    }
}*/


class Solution606 {
    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        dfs(t,sb);
        return sb.toString();
    }
    public void dfs(TreeNode t, StringBuilder sb){
        if (t != null){
            sb.append(t.val);
            if (t.left != null || t.right != null){
                sb.append("(");
                dfs(t.left,sb);
                sb.append(")");
            }
            if (t.right != null){
                sb.append("(");
                dfs(t.right,sb);
                sb.append(")");
            }
        }
    }
}