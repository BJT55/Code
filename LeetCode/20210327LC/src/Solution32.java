import java.util.*;

class Solution32 {
    public int[] levelOrder(TreeNode root) {
        if(root == null)
            return new int[0];

        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }
        int[] ret = new int[list.size()];
        for(int i = 0; i < ret.length; ++i){
            ret[i] = list.get(i);
        }
        return ret;
    }
}