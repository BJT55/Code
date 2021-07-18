import java.util.HashMap;
import java.util.Map;

public class JZ07 {
    private Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = inorder.length;
        for(int i = 0; i < len; i++){
            map.put(inorder[i],i);
        }
        return myBuilderTree(preorder,0,len-1,inorder,0,len-1);
    }

    private TreeNode myBuilderTree(int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight){
        if(preLeft > preRight){
            return null;
        }
        int preRoot = preLeft;
        int inRoot = map.get(preorder[preRoot]);
        int leftLen = inRoot - inLeft;

        TreeNode root = new TreeNode(preorder[preRoot]);
        root.left = myBuilderTree(preorder, preLeft+1, preLeft+leftLen, inorder, inLeft, inRoot-1);
        root.right = myBuilderTree(preorder, preLeft+leftLen+1, preRight, inorder, inRoot+1, inRight);
        return root;
    }
    class TreeNode{
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
