
// 双向链表结点
class Node{
    int val;
    Node prev;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}

// 实现一个自己的双向链表
public class MyLinkedList {
    // 头结点位置
    private Node head;
    // 尾结点位置
    private Node tail;
    // 链表元素个数
    private int length = 0;

    public MyLinkedList() {
        // 没有傀儡结点
        head = null;
        tail = null;
    }

    public int length(){
        return this.length;
    }

    // 根据下标找到结点：
    public Node getNodeByIndex(int index){
        if (index < 0 || index >= length){
            return null;
        }
        Node cur = head;
        for (int i = 0; i < index; ++i){
            cur = cur.next;
        }
        return cur;
    }

    // 1.插入结点
    // 头插
    public void addFront(int val){
        Node newHead = new Node(val);
        // 空链表
        if (head == null){
            head = newHead;
            tail = newHead;
            length++;
            return;
        }
        // 非空
        newHead.next = head;
        head.prev = newHead;
        head = newHead;
        length++;
        return;
    }
    // 尾插
    public void addEnd(int val){
        Node newTail = new Node(val);
        // 空链表
        if (head == null){
            head = newTail;
            tail = newTail;
            length++;
            return;
        }
        // 非空
        tail.next = newTail;
        newTail.prev = tail;
        tail = newTail;
        length++;
        return;
    }
    // 指定位置插入
    public void addByIndex(int index,int val){
        // 处理特殊情况
        if (index < 0 || index > length)
            return;
        if (index == 0){
            addFront(val);
            return;
        }
        if (index == length){
            addEnd(val);
            return;
        }
        // 一般情况
        Node newNode = new Node(val);
        // 先找到下标结点
        Node posNode = getNodeByIndex(index);
        // 记录下表结点的前一个
        Node prevNode = posNode.prev;
        // 往 pos 之前插入newNode
        prevNode.next = newNode;
        newNode.prev = prevNode;

        newNode.next = posNode;
        posNode.prev = newNode;
        return;
    }



    // 2.删除
    // 头删
    public void removeFirst(){
        // 特殊情况
        if (head == null)
            return;
        if (head.next == null){
            head = null;
            tail = null;
            length = 0;
            return;
        }
        // 一般情况
        Node nextNode = head.next;
        nextNode.prev = null;
        head = nextNode;
    }
    // 尾删
    public void removeLast(){
        // 特殊情况
        if (head == null)
            return;
        if (head.next == null){
            head = null;
            tail = null;
            length = 0;
            return;
        }
        // 一般情况
        Node prevNode = tail.prev;
        prevNode.next = null;
        tail = prevNode;

    }
    // 给定位置删除
    public void removeByIndex(int index){
        if (index < 0 || index >= length)
            return;
        if (index == 0){
            // 头删
            removeFirst();
            return;
        }
        if (index == length){
            // 尾删
            removeLast();
            return;
        }

        Node deleNode = getNodeByIndex(index);
        Node prevNode = deleNode.prev;
        Node nextNode = deleNode.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        return;
    }
    // 给定值删除
    public void removeByValue(int val){
        int index = indexOf(val);
        if (index == -1)
            return;
        removeByIndex(index);
    }

    // 3.查找
    public int get(int index){
        return getNodeByIndex(index).val;
    }
    public int indexOf(int val){
        Node cur = head;
        for (int i = 0; i < length; ++i){
            if (cur.val == val)
                return i;
            cur = cur.next;
        }
        return -1;
    }

    // 4.修改
    public void set(int index, int val){
        Node cur = getNodeByIndex(index);
        cur.val = val;
    }
}
