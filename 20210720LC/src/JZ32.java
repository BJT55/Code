import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class JZ32 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = true;
        while (!queue.isEmpty()){
            int size = queue.size();
            LinkedList<Integer> list = new LinkedList<>();
            while (size-- > 0){
                TreeNode node = queue.poll();
                if (res.size() % 2== 0){
                    list.addLast(node.val);
                }else {
                    list.addFirst(node.val);
                }
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
