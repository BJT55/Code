import java.util.HashMap;

class TreeNode {
    int va;
    TreeNode left;
    TreeNode right;

    public TreeNode(int va) {
        this.va = va;
    }
}
class Solution {
    int[] preorder;
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; ++i){
            map.put(preorder[i],i);
        }
        return help(0,0,inorder.length-1);
    }
    TreeNode help(int root, int left, int right){
        if(left > right){
            return null;
        }

        TreeNode node = new TreeNode(preorder[root]);
        int rootIndex = map.get(preorder[root]);
        node.left = help(root+1,left,rootIndex-1);
        node.right = help(root + rootIndex - left + 1,rootIndex + 1,right);
        return node;
    }
}