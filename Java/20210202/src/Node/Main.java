/*
package Node;

public class Main {

    public static Node createList(){
//        Node dummy = new Node();  //傀儡节点
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
//        dummy.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null; // 可不写，
        return a;
    }

    public static void main(String[] args) {
        Node head = createList();
//        System.out.println(head);

        // 1.遍历链表，打印每个元素
*/
/*        for (Node cur = head; cur != null; cur = cur.next){
            System.out.print(cur.val + " ");
        }*//*


        // 2.遍历链表，找到链表的最后一个节点
*/
/*        Node cur = head;
        while (cur != null && cur.next != null){
            cur = cur.next;
        }
        System.out.println(cur.val);*//*


        // 3.遍历链表，找到链表倒数第二个节点
*/
/*        Node cur = head;
        while (cur != null && cur.next.next != null){
            cur = cur.next.next;
        }
        System.out.println(cur.val);*/
/*


        // 4.遍历链表，找到第 n 个结点（正数）
*/
/*        int n = 3;
        Node cur = head;
        for (int i = 1; i < n; i++){
            cur = cur.next;
        }
        // 此时 cur 指向的元素就是正数第 n 个元素
        System.out.println(cur.val);*//*


        // 5.获取链表的长度
*/
/*        int count = 0;
        for (Node cur = head; cur != null; cur = cur.next){
            count++;
        }
        System.out.println(count);*//*


        // 6.获取链表倒数第 n 个结点（结合4,5）
*/
/*        int count = 0;
        for (Node cur = head; cur != null; cur = cur.next){
            count++;
        }
        int n = count - 3 + 1; // 假设为倒数第 3 个结点
        Node cur = head;
        for (int i = 1; i < n; i++){
            cur = cur.next;
        }
        // 此时 cur 指向的元素就是正数第 n 个元素
        System.out.println(cur.val);*//*



        // 7.遍历链表，查找链表上是否存在某个值
*/
/*        int findVal = 3;
        int i = 1;
        Node cur = head;
        for (; cur != null; cur = cur.next){
            if (cur.val == findVal){
                break;
            }
            i++;
        }
        if (cur == null){
            System.out.println("未找到为 " + findVal + " 的值");
        }else {
            System.out.println("已找到为 " + findVal + " 的值");
            System.out.println("该值在链表中第 " + i + " 位...");
        }*//*




    }
}
*/
