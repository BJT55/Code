import java.util.LinkedList;
import java.util.Queue;

/*
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}


public class BinaryTree {
    // 判断是否为完全二叉树
    public static boolean isCompleteTree(TreeNode root){
        if (root == null)
            return true;

        // 层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean level1 = true; // true 为第一阶段

        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if (level1){
                // 第一阶段
                if(cur.left != null && cur.right != null){
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                }
                else if (cur.left == null && cur.right != null){
                    return false;
                }
                else if (cur.left != null && cur.right == null){
                    // 进入第二阶段判断
                    level1 = false;
                    queue.offer(cur.left);
                }else {
                    // 都为空情况
                    level1 = false;
                }
            }
            else{
                // 第二阶段
                if (cur.left != null || cur.right != null)
                    return false;
            }
        }
        return true;
    }

    // 层序遍历
    public static void levelOrder(TreeNode root){
        if (root == null)
            return;

        Queue<TreeNode> queue  = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            System.out.print(cur.val+" ");
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }

}

*/
