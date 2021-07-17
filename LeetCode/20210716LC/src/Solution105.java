import java.util.HashMap;
import java.util.Map;

public class Solution105 {
    private Map<Integer,Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<Integer,Integer>();
        int len = preorder.length;
        for (int i = 0; i < len; i++) {
            map.put(inorder[i],i);
        }
        return myBuildTree(preorder,0,len-1,inorder,0,len-1);
    }

    private TreeNode myBuildTree(int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight) {
        if (preLeft > preRight){
            return null;
        }

        int preRoot = preLeft;
        int inRoot = map.get(preorder[preRoot]);
        int leftSize = inRoot-inLeft;

        TreeNode root = new TreeNode(preorder[preRoot]);
        root.left = myBuildTree(preorder, preLeft+1, preLeft+leftSize, inorder, inLeft, inRoot-1);
        root.right = myBuildTree(preorder, preLeft+leftSize+1, preRight, inorder, inRoot+1, inRight);
        return root;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
