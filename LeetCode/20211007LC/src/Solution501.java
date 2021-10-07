import java.util.ArrayList;
import java.util.List;

public class Solution501 {
    int base, count, maxCount;
    List<Integer> answer = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        TreeNode cur = root, pre = null;
        while (cur != null){
            if (cur.left == null){
                update(cur.val);
                cur = cur.right;
                continue;
            }

            pre = cur.left;
            while (pre.right != null && pre.right != cur){
                pre = pre.right;
            }

            if (pre.right == null){
                pre.right = cur;
                cur = cur.left;
            }else {
                pre.right = null;
                update(cur.val);
                cur = cur.right;
            }
        }

        int[] res = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            res[i] = answer.get(i);
        }
        return res;
    }

    private void update(int val) {
        if (val == base){
            count++;
        }else {
            count = 1;
            base = val;
        }

        if (count == maxCount){
            answer.add(base);
        }

        if (count > maxCount){
            maxCount = count;
            answer.clear();
            answer.add(base);
        }
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
