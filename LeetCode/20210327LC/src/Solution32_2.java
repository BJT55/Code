import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List< List<Integer> > ret = new ArrayList<>();
        if(root == null)
            return ret;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = queue.size();

            for(int i = size; i > 0; --i){
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            ret.add(level);
        }
        return ret;
    }
}