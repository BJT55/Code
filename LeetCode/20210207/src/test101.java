//
public class test101 {

}
/*

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

class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return def(root.left,root.right);
    }
    public boolean def(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        else if(p == null || q == null || p.val != q.val) return false;
        else return def(p.left, q.right) && def(p.right, q.left);
    }
}*/
