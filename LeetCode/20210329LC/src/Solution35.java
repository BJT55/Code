import java.util.HashMap;
import java.util.Map;

/*
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
    }
}
class Solution35 {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;

        Map<Node, Node> map = new HashMap<>();
        for(Node cur = head; cur != null; cur = cur.next){
            map.put(cur, new Node(cur.val));
        }
        for(Node cur = head; cur != null; cur = cur.next){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
        }
        return map.get(head);
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        // 将复制的结点放在原节点后面
        for(Node cur = head, copy = null; cur != null; cur = cur.next.next){
            copy = new Node(cur.val);
            copy.next = cur.next;
            cur.next = copy;
        }
        // 将拷贝结点的 random 也复制
        for(Node cur = head; cur != null; cur = cur.next.next){
            if(cur.random != null){
                cur.next.random = cur.random.next;
            }
        }
        // 分离拷贝结点和原结点
        Node newHead = head.next;
        for(Node cur = head, copy = null; cur != null && cur.next != null;){
            copy = cur.next;
            cur.next = copy.next;
            cur = copy;
        }
        return newHead;
    }
}*/
