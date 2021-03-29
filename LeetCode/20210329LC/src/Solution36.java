class Node {
    int val;
    Node left;
    Node right;

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution36 {
    Node head, pre;
    public Node treeToDoublyList(Node root) {
        if (root == null)
            return null;

        dfs(root);
        // 头为节点互指
        head.left = pre;
        pre.right = head;

        return head;
    }
    public void dfs(Node node){
        if (node == null)
            return;

        dfs(node.left);
        // pre 记录 node 左侧的结点
        // 当 pre 为空时，node 左侧无结点，
        // 即此时 node 为双向链表的头结点
        // 否则，node 左侧有结点
        if (pre != null){
            pre.right = node;
        }else {
            head = node;
        }
        node.left = pre;
        pre = node;
        dfs(node.right);
    }
}