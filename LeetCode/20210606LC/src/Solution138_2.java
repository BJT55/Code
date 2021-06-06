public class Solution138_2 {
    public Node copyRandomList(Node head) {
        if (head == null){
            return head;
        }
        // 将克隆的结点放在原结点之后
        Node node = head;
        while (node != null){
            Node clone = new Node(node.val, node.next,null);
            Node tmp = node.next;
            node.next = clone;
            node = tmp;
        }
        // 处理random指针
        node = head;
        while (node != null){
            node.next.random = node.random == null ? null : node.random.next;
            node = node.next.next;
        }
        // 还原原始链表,即分离原链表和克隆链表
        node = head;
        Node cloneHead = head.next;
        while (node.next != null){
            Node tmp = node.next;
            node.next = node.next.next;
            node = tmp;
        }
        return cloneHead;
    }
    class Node{
        Node next;
        Node random;
        int val;

        public Node(int val, Node next, Node random) {
            this.next = next;
            this.random = random;
            this.val = val;
        }
    }
}
