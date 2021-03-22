class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class BinaryTree {
    // 二叉树最近公共祖先：
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;

        findNode(root,p,q);
        return ret;

    }
    public TreeNode ret;
    public boolean findNode(TreeNode root, TreeNode p, TreeNode q){
        if (root == null)
            return false;

        // 判定根节点
        int mid = (root == p || root == q) ? 1 : 0;
        // 查找左子树
        int left = findNode(root.left,p,q) ? 1 : 0;
        // 查找右子树
        int right = findNode(root.right,p,q) ? 1 : 0;

        if (mid + left + right == 2){
            ret = root;
        }
        return (mid + left + right) > 0;
    }


    // 把一个二叉搜索树转换为一个双向链表
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;

        if (pRootOfTree.left == null && pRootOfTree.right == null)
            return pRootOfTree;

        TreeNode leftHead = Convert(pRootOfTree.left);
        TreeNode leftTail = leftHead;
        while (leftTail != null && leftTail.right != null){
            leftTail = leftTail.right;
        }

        if (leftTail != null) {
            leftTail.right = pRootOfTree;
            pRootOfTree.left = leftTail;
        }

        TreeNode rightHead = Convert(pRootOfTree.right);
        if (rightHead != null) {
            pRootOfTree.right = rightHead;
            rightHead.left = pRootOfTree;
        }
        return leftHead == null ? pRootOfTree : leftHead;
    }

    // 根据前序和中序遍历构造一个二叉树
    public static int index;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0)
            return null;

        index = 0;
        return _buildTree(preorder,inorder,0,inorder.length);
    }
    public TreeNode _buildTree(int[] preorder, int[] inorder, int inorderLeft, int inorderRight){
        if (inorderLeft >= inorderRight || index >= preorder.length)
            return null;

        TreeNode root = new TreeNode(preorder[index]);
        // 找到 root 在中序遍历中的位置
        int pos = 0;
        while (preorder[index] != inorder[pos]){
            pos++;
        }
        index++;
        root.left = _buildTree(preorder, inorder, inorderLeft, pos);
        root.right = _buildTree(preorder, inorder, pos+1,inorderRight);
        return root;
    }


    // LC606:根据二叉树创建字符串  1(2(4))(3)
    StringBuilder ans = new StringBuilder();
    public String tree2str(TreeNode t) {
        if (t == null)
            return "";

        helper(t);
        ans.deleteCharAt(0);
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
    public void helper(TreeNode t){
        if (t == null)
            return ;

        ans.append("(");
        ans.append(t.val);
        helper(t.left);
        if (t.left == null && t.right != null){
            ans.append("()");
        }
        helper(t.right);
        ans.append(")");

    }
}
