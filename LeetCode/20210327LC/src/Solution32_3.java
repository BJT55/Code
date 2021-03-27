import java.util.*;

class Solution32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List< List<Integer> > ret = new ArrayList<>();
        if(root == null)
            return ret;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1; // 由奇偶数判断从左到右还是从右到左

        while(!queue.isEmpty()){
            LinkedList<Integer> level = new LinkedList<>();
            int size = queue.size();

            while(size-- > 0){
                TreeNode node = queue.poll();
                if(i % 2 == 1){
                    level.addFirst(node.val);
                }else{
                    level.addLast(node.val);
                }
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            ret.add(level);
            i++;
        }
        return ret;
    }
}