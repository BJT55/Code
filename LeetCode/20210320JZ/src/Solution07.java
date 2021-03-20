class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
class Solution07 {
    public int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return help(preorder,inorder,0,inorder.length);
    }
    public TreeNode help(int[] preorder, int[] inorder, int inorderLeft, int inorderRight){
        if(inorderLeft >= inorderRight)
            return null;

        int i = 0;
        TreeNode root = new TreeNode(preorder[index]);
        while(i < inorderRight && preorder[index] != inorder[i]){
            i++;
        }
        index++;

        root.left = help(preorder,inorder,inorderLeft,i);
        root.right = help(preorder,inorder,i+1,inorderRight);
        return root;
    }
}