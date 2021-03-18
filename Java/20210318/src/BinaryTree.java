class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

class ListNode {
    int val;
    ListNode pre;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class BinaryTree {
    // 找到给定的两个结点最近的公共祖先
    public TreeNode lca = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if (root == null)
            return null;

        // 递归查找 p 和 q
        findNode(root,p,q);
        return lca;
    }
    // 若找到其中一个，就返回 true
    // 若都没找到，则返回 false
    public boolean findNode(TreeNode root, TreeNode p, TreeNode q){
        if (root == null)
            return false;

        // 判断根节点是否为 p q
        int mid =  (root == p || root == q) ? 1 : 0;
        // 在左子树查找
        int left = findNode(root.left, p, q) ? 1 : 0;
        // 在右子树查找
        int right = findNode(root.right, p, q) ? 1 : 0;

        // 符合上述条件中的两个
        if (mid + left + right == 2)
            lca = root;

        return (mid + left + right) > 0;
    }



    // 二叉搜索树转换为一个排序的双向链表
    public TreeNode Convert(TreeNode pRootOfTree){
        if (pRootOfTree == null)
            return null;

        if (pRootOfTree.left == null && pRootOfTree.right == null)
            return pRootOfTree;

        // 一般情况：
        // 1.递归将左子树转化为链表
        TreeNode leftHead = Convert(pRootOfTree.left);
        // 2.把根节点 尾插 到 leftHead 链表中
        TreeNode letfTail = leftHead;
        while (letfTail != null && letfTail.right != null){
            letfTail = letfTail.right;
        }
        if (leftHead != null) {   // rightTail 也可以么?
            letfTail.right = pRootOfTree;
        }
        pRootOfTree.left = letfTail;
        // 3.递归将右子树转换为链表
        TreeNode rightHead = Convert(pRootOfTree.right);
        // 4.将当前节点 头插 到右侧链表的前面
        if (rightHead != null){
            pRootOfTree.right = rightHead;
            rightHead.left = pRootOfTree;
        }

        // 返回最终链表的头结点
        // leftHead 可能为空,若为空，则 pRootOfTree 为链表的头部
        return leftHead != null ? leftHead : pRootOfTree;
    }


    // 根据 先序遍历 和 中序遍历 来构造一个二叉树
    public int index = 0;          // 成员变量，表示当前访问到 先序遍历 的第几个元素
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // 多组输入，index 每次使用时重置
        index = 0;
        return _buildTree(preorder,inorder,0,inorder.length);
    }
    public TreeNode _buildTree(int[] preorder,int[] inorder,int inorderLeft,int inorderRight){
        if (inorderLeft >= inorderRight){
            // 中序区间是一个空区间，当前子树是空树
            return null;
        }
        if (index >= preorder.length){
            // 先序遍历完毕
            return null;
        }

        // 处理一般操作
        TreeNode root = new TreeNode(preorder[index]);
        // 查找当前节点在 中序遍历 中处在的位置
        int pos = find(inorder,inorderLeft,inorderRight,root.val);
        // 如果遍历结果有空节点，需要 ++ 两次
        // 如果没有空节点，则只需要 ++ 一次
        index++;

        root.left = _buildTree(preorder, inorder, inorderLeft, pos);
        root.right = _buildTree(preorder, inorder, pos+1, inorderRight);

        return root;
    }
    public int find(int[] inorder, int inorderLeft, int inorderRight, int toFind){
        for (int i = inorderLeft; i < inorderRight; ++i){
            if (inorder[i] == toFind){
                return i;
            }
        }
        return -1;
    }


    // 二叉树建立字符串
    public StringBuilder ret = null;
    public String tree2str(TreeNode t){
        ret = new StringBuilder();
        if (t == null)
            return "";

        // 通过 helper 方法辅助进行先序遍历的递归
        helper(t);
        // 去掉最外层 ()
        ret.deleteCharAt(0);
        ret.deleteCharAt(ret.length()-1);

        return ret.toString();
    }
    public void helper(TreeNode root){
        if (root == null)
            return;

        ret.append("(");
        ret.append(root.val);
        helper(root.left);
        if (root.left == null && root.right != null){
            ret.append("()");
        }
        helper(root.right);
        ret.append(")");

    }
}
