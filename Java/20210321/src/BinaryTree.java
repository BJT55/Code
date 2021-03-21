import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTree {
    // 非递归前序遍历：
    public static void preOrderByLoop(TreeNode root){
        if (root == null)
            return;
        // 创建一个栈
        Stack<TreeNode> stack = new Stack<>();
        // 将根节点入栈
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode cur = stack.pop();
            System.out.print(cur.val+" ");

            if (root.right != null) {
                stack.add(root.right);
            }
            if (root.left != null) {
                stack.add(root.left);
            }
        }
        return;
    }

    // 非递归中序遍历：
    public static void inOrderByLoop(TreeNode root){
        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (true){
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            // 循环结束，cur 此时为空
            if (stack.isEmpty()) {
                // 遍历完毕
                break;
            }
            // 取栈顶，遍历右子树
            TreeNode top = stack.pop();
            System.out.print(top.val+" ");
            cur = top.right;
        }
    }


    public static void postOrderByLoop(TreeNode root){
        if (root == null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode pre = null; // 表示遍历结果的前一个元素
        while (true){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack.peek();
            if (top.right == null || top.right == pre){
                System.out.print(top.val + " ");
                stack.pop();
                pre = top;
            }else{
                cur = top.right;
            }
        }
    }
}
