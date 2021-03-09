// 使用链表实现栈：
class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}

public class MyStack2 {
    // 使用不带傀儡结点的链表来表示
    private  Node head = null;
    // 核心操作
    // 1.入栈
    public void push(int val){
        Node newNode = new Node(val);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // 2.出栈
    public Integer pop(){
        if (head == null){
            return null;
        }
        if (head.next == null){
            int ret = head.val;
            head = null;
            return ret;
        }
        int ret = head.val;
        head = head.next;
        return ret;
    }
    // 3.取栈顶元素
    public Integer peek(){
        if (head == null){
            return null;
        }
        return head.val;
    }

}
