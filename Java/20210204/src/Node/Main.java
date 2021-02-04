package Node;

public class Main {
    public static Node createList(int val){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        return a;
    }

    public static void print(Node head){
        for (Node cur = head; cur != null; cur = cur.next){
            System.out.print(" " + cur.val);
        }
    }

    // 针对不带傀儡结点的链表进行尾删
    public static Node removeTail(Node head){
        if (head == null ){
            return null;
        }
        if (head.next == null){
            // 链表只有一个结点，尾删的结点就是这个head本身
            // 删去尾结点链表就为空，则返回空链表
            return null;
        }
        Node prev = head;
        Node toDelete = prev.next;
        while (prev != null && prev.next != null){
            toDelete = prev.next;
            if (toDelete.next == null){
                break;
            }
            prev = prev.next;
        }
        // 接下来删除这个结点
        // 由于 toDelete 已经是最后一个结点了，他的 next 一定第 null
        prev.next = toDelete.next;
        // 因此，也可以写成
//        prev.next = null;
        return head;
    }


    // 将数组转换成链表
    // 返回的链表是一个不带傀儡的链表
    public static Node arrayToLinkedList(int[] array){
        Node head = null;
        Node tail = null;
        for (int x: array){
            Node node = new Node(x);
            if (head == null){
                head = node;
                tail = node;
            }else {
                // 链表不为空的时候，再进行新的插入，就不必管 head，直接操作 tail 即可
                tail.next = node;
                tail = tail.next;
            }
        }
        return head;
    }

    public static Node arrayToLinkedList2(int[] array) {
        // 2.0版 更简单方式实现
        // 如果我们创建一个带有傀儡结点的链表
        Node head = new Node(0);
        Node tail = head;
        for (int x : array){
            Node node = new Node(x);
            tail.next = node;
            tail = tail.next;
        }
        // 返回的是不带傀儡结点的链表
        // 如果返回 head ，则返回的是带傀儡结点的链表
        return head.next;
    }

    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        Node head = arrayToLinkedList(array);
        print(head);
    }
}
