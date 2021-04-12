import java.util.List;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class test18 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null)
            return null;

        if(head.val == val)
            return head.next;

        ListNode pre = null;
        for(ListNode cur = head; cur != null; cur = cur.next){
            if(cur.val == val){
                pre.next = cur.next;
            }
            pre = cur;
        }
        return head;
    }
}
