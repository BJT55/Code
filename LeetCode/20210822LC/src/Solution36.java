public class Solution36 {
    Node pre, head;
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void dfs(Node cur) {
        if (cur == null) return;
        dfs(cur);
        if (pre != null){
            pre.right = cur;
        }else {
            head = cur;
        }
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }

    class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
}
