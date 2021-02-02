package List;

public class Main {

    public static Node creatList(){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = c;
        c.next = e;
        e.next = d;
        d.next = b;
        return a;
    }

    public static void main(String[] args) {
        Node head = creatList();
        // 1.
        System.out.println("打印链表的每个元素：");
        for (Node cur = head; cur != null; cur = cur.next){
            System.out.print(cur + " ");
        }

        // 2.
/*        System.out.println("找到链表的最后一个结点:");
        Node cur = head;
        while (cur != null && cur.next != null){
            cur = cur.next;
        }
        System.out.println(cur.val);*/

        // 3.
/*        System.out.println("找到链表的倒数第二个结点:");
        Node cur = head;
        while (cur != null && cur.next != null && cur.next.next != null){
            cur = cur.next;
        }
        System.out.println(cur.val);*/

        // 4.
/*        System.out.println("找到链表的第 n(链表长度>=n) 个结点(当n为2时)：");
        Node cur = head;
        for (int n = 2; n > 1; n--){
            cur = cur.next;
        }
        System.out.println(cur.val);*/

        // 5.
/*        System.out.println("计算链表中元素的个数：");
        int count = 0;
        for (Node cur = head; cur != null; cur = cur.next){
            count++;
        }
        System.out.println(count);*/

        // 6.
        System.out.println("找到链表中是否包含某个元素：");
        int findVal = 5;
        int index = 1;
        Node cur = head;
        for (; cur != null; cur = cur.next){
            if (cur.val == findVal){
                break;
            }
            index++;
        }
        if (cur == null){
            System.out.println("未找到为 " + findVal + " 的值");
        }else {
            System.out.println("已找到为 " + findVal + " 的值");
            System.out.println("该值在链表的第 " + index + " 位");
        }
    }
}
