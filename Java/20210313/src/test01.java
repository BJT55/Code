import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

}

public class test01 {

    // 先序遍历：
    public  List<Integer> preorderTraversal(TreeNode root){
        List<Integer> ret = new ArrayList<>();
        if (root == null)
            return ret;

        ret.add(root.val);
        ret.addAll(preorderTraversal(root.left));
        ret.addAll(preorderTraversal(root.right));
        return ret;
    }

    // 中序遍历：
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> ret = new ArrayList<>();
        if (root == null)
            return null;

        ret.addAll(inorderTraversal(root.left));
        ret.add(root.val);
        ret.addAll(inorderTraversal(root.right));
        return ret;
    }

    // 两个数是否相同
    public boolean isSameTree(TreeNode p, TreeNode q){
        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        if (p.val != q.val)
            return false;

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    // 另一个树的子树
    public boolean isSubtree(TreeNode s, TreeNode t){
        if (s == null)
            return false;

        boolean flag = isSameTree(s,t);

        if (flag)
            return flag;

        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    // 二叉树的最大深度
    public int maxDepth(TreeNode root){
        if (root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + (left > right ? left : right);
    }
    
}