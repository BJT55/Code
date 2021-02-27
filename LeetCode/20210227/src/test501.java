import java.util.ArrayList;
import java.util.List;

public class test501 {

}

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution501 {
    List<Integer> answer = new ArrayList<>();
    int base, count, max;
    public int[] findMode(TreeNode root) {
        dfs(root);
        int[] mode = new int[answer.size()];
        for (int i = 0; i < answer.size(); ++i){
            mode[i] = answer.get(i);
        }
        return mode;
    }
    public void dfs(TreeNode root){
        if (root == null) return;
        dfs(root.left);
        update(root.val);
        dfs(root.right);
    }
    public void update(int x){
        if(x == base) count++;
        else {
            count = 1;
            base = x;
        }
        if(count == max){
            answer.add(base);
        }
        if (count > max){
            max = count;
            answer.clear();
            answer.add(base);
        }
    }
}
