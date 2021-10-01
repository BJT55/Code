public class Solution450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val){
            root.left = deleteNode(root.left,key);
        }else if (key > root.val){
            root.right = deleteNode(root.right,key);
        }else {
            // 删除当前节点
            if (root.left != null && root.right != null){
                // 寻找当前节点的中序后继节点, 即右子树中最左子结点
                TreeNode prev = root;
                TreeNode next = root.right;
                while (next.left != null){
                    prev = next;
                    next = next.left;
                }
                // 删除最左子结点
                if (prev == root){
                    prev.right = next.right;
                }else {
                    prev.left = next.right;
                }
                // 删除当前节点
                root.val = next.val;
            }else if (root.left == null){
                return root.right;
            }else {
                return root.left;
            }
        }
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
