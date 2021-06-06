import java.util.HashMap;
import java.util.Map;

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null){
            return head;
        }

        Node node = head;
        Map<Node,Node> map = new HashMap<>();
        while (node != null){
            Node clone = new Node(node.val,null,null);
            map.put(node,clone);
            node = node.next;
        }
        node = head;
        while (node != null){
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node = node.next;
        }
        return map.get(head);
    }

    class Node{
        Node next;
        Node random;
        int val;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node random) {
            this.next = next;
            this.random = random;
            this.val = val;
        }
    }
}