public class Solution35 {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node cur = head;
        // 复制每个节点
        while (cur != null){
            Node tmp = new Node(cur.val);
            tmp.next = cur.next;
            cur.next = tmp;
            cur = tmp.next;
        }
        // 构建random的指向
        cur = head;
        while (cur != null){
            if (cur.random != null){
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        // 拆分链表
        cur = head.next;
        Node pre = head, newHead = pre.next;
        while (cur.next != null){
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null;
        return newHead;
    }

    class Node{
        int val;
        Node next;
        Node random;
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next, Node random) {
            this.val = val;
            this.next = next;
            this.random = random;
        }
    }
}
