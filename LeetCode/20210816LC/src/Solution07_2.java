import java.util.HashMap;
import java.util.Map;

public class Solution07_2 {
    private Map<Integer,Integer> indexMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        indexMap = new HashMap<>();
        for (int i = 0; i < len; i++){
            indexMap.put(inorder[i],i);
        }
        return myBuilderTree(preorder,inorder,0,len-1,0,len-1);
    }

    private TreeNode myBuilderTree(int[] preorder, int[] inorder, int pre_left, int pre_right, int in_left, int in_right) {
        if (pre_left > pre_right){
            return null;
        }
        int pre_root_index = pre_left;
        int in_root_index = indexMap.get(preorder[pre_root_index]);

        TreeNode root = new TreeNode(preorder[pre_root_index]);
        int size = in_root_index - in_left;
        root.left = myBuilderTree(preorder, inorder, pre_left+1, pre_left+size, in_left, in_root_index-1);
        root.right = myBuilderTree(preorder, inorder, pre_left+size+1, pre_right, in_root_index+1, in_right);
        return root;
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
