import java.util.HashMap;
import java.util.Map;

class LRUCache {
    class DLinkedNode{
        int key;
        int val;
        DLinkedNode prev;
        DLinkedNode next;
        public DLinkedNode(){ }

        public DLinkedNode(int _key, int _val) {
            val = _val;
            key = _key;
        }
    }

    private int capacity;
    private int size;
    private DLinkedNode head,tail;
    private Map<Integer,DLinkedNode> cache = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        // 如果 key 存在，先通过哈希表定位，再移到头部
        moveToHead(node);
        return node.val;
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToHead(DLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node == null){
            DLinkedNode newNode = new DLinkedNode(key,value);
            cache.put(key,newNode);
            addToHead(newNode);
            size++;
            if (size > capacity){
                DLinkedNode tail = removeTail();
                cache.remove(tail.key);
                size--;
            }
        }else {
            node.val = value;
            moveToHead(node);
        }
    }

    private DLinkedNode removeTail() {
        DLinkedNode node = tail.prev;
        removeNode(node);
        return node;
    }
}