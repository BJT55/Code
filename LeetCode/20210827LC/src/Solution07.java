import java.util.HashMap;
import java.util.Map;

public class Solution07 {
    private Map<Integer,Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        int len = preorder.length;
        for (int i = 0; i < len; i++){
            map.put(inorder[i],i);
        }
        return myBuildTree(preorder,inorder,0,len-1,0,len-1);
    }

    private TreeNode myBuildTree(int[] preorder, int[] inorder, int pre_left, int pre_right, int in_left, int in_right) {
        if (pre_left > pre_right) return null;

        int pre_root = pre_left;
        int in_root = map.get(preorder[pre_root]);
        // 建立根节点
        TreeNode root = new TreeNode(preorder[pre_root]);
        // 左子树节点数目
        int left_size = in_root - in_left;
        // 构造左子树
        root.left = myBuildTree(preorder, inorder, pre_left+1, pre_left+left_size, in_left, in_root-1);
        root.right = myBuildTree(preorder, inorder, pre_left+left_size+1, pre_right, in_root+1, in_right);
        return root;
    }

    class  TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}