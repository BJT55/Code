package Node;

public class Main {

    public static Node createList(){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        return a;
    }

    // 带傀儡结点的链表
    // 本质上区别在于 傀儡节点 中的值是不使用的
    // 链表长度为 4
    public static Node createListWithDummy(){
        Node dummy = new Node(0);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        dummy.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        return dummy;
    }


    public static void print(Node head){
        for (Node cur = head; cur != null; cur = cur.next){
            System.out.print( " " + cur.val);
        }
    }
    // 尾插
    public static void insertTail(Node head, int val){
        if (head == null){
            return;
        }
        Node cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        Node newNode = new Node(val);
        cur.next = newNode;
    }

    // 按值删除结点
    public static void remove(Node head, int val){
        Node prev = head;
        while (prev != null
                && prev.next != null
                && prev.next.val != val){
            prev = prev.next;
        }

        if (prev == null || prev.next == null){
            return;
        }

/*        Node toDelete = prev.next;
        prev.next = toDelete.next;*/
        //相当于：
        prev.next = prev.next.next;
    }


    // 按位置删除结点
    public static void remove(Node head, Node toDelete){
        Node prev = head;
        while (prev != null && prev.next != toDelete){
            prev = prev.next;
        }
        if (prev == null){
            return;
        }
        prev.next = toDelete.next;
    }

    // 删除位置2.0版 （但无法删除最后末尾结点）
    public static void remove2(Node head, Node toDelete){
        Node nextNode = toDelete.next;
        toDelete.val = nextNode.val;
        toDelete.next = nextNode.next;
    }

    // 给定结点下标来删除：
    public static void remove3(Node head, int index){
        Node prev = head;
        if (index < 0 || index > size(head)){
            return;
        }
        for (int i = 0; i < index - 1; i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    public static int size(Node head){
        int count = 0;
        for (Node cur = head; cur != null; cur = cur.next){
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
/*        Node head = createList();
        System.out.println(head);
        // 把节点插入到 1 和 2 之间
        Node prev = head;
        Node newNode = new Node(100);
        newNode.next = prev.next;
        prev.next = newNode;*/
//        print(prev);

        // 把新结点插入到第一个位置
/*        Node newNode = new Node(100);
        newNode.next = head;
        head = newNode;
        print(head);*/

        // 创建带傀儡结点的链表
/*        Node head = createListWithDummy();
        Node newNode = new Node(100);
        // 1.往中间位置插入
        Node pre = head.next;
        newNode.next = pre.next;
        pre.next = newNode;
        print(pre);*/


/*        Node head = createList();
        // 尾插 100
        insertTail(head,100);
        print(head);*/

        // 删除 4 结点
/*        Node head = createList();
        remove(head,2);
        print(head);*/

        // 删除下标为 1 的结点
/*        Node head = createList();
        remove3(head,1);
        print(head);*/

/*        // 删除 tmp 结点
        Node head = createList();
        Node tmp = head.next;
        remove(head,tmp);
        print(head);*/

        // 删除头结点
/*        Node head = createList();
        head = head.next;
        print(head);*/

        Node head = createList();
        if(head == null) {
            throw new RuntimeException("链表为空");
        }
        head = head.next;
        print(head);
    }
}
