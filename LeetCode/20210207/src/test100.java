
//给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
//如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
public class test100 {
    public static void main(String[] args) {

    }
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

class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 若两棵二叉树都为空，则他们一定相等
        if( p == null && q == null) return true;
        // 若俩颗二叉树其中一个为空，另一个不为空，则一定不相同
        else if(p == null || q == null) return false;
        // 若俩颗二叉树的根节点值不同，则他们一定不相同
        else if(p.val != q.val)  return false;
        // 排除以上情况，递归调用判断左右孩子是否相等
        else return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
    }
}*/
