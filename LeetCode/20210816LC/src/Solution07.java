import java.util.Arrays;

public class Solution07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        if (len == 0) return null;

        int rootVal = preorder[0], rootIndex = 0;
        for (int i = 0; i < len; i++){
            if (inorder[i] == rootVal){
                rootIndex = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(Arrays.copyOfRange(preorder,1,1+rootIndex),
                            Arrays.copyOfRange(inorder,0,rootIndex));
        root.right = buildTree(Arrays.copyOfRange(preorder,rootIndex+1,len),
                            Arrays.copyOfRange(inorder,rootIndex+1,len));

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
