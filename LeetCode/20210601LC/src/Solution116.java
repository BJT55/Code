class Solution116 {
    public Node connect(Node root) {
        if (root == null || root.left == null){
            return root;
        }
        root.left.next = root.right;
        if (root.next != null){
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
    public class Node{
        Node left;
        Node right;
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node left, Node right, Node next, int val) {
            this.left = left;
            this.right = right;
            this.next = next;
            this.val = val;
        }
    }
}