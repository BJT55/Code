import java.util.List;

public class JZ18 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null){
            return null;
        }
        if(head.val == val){
            return head.next;
        }

        ListNode cur = head;
        ListNode pre = null;
        while(cur != null){
            if(cur.val == val){
                pre.next = cur.next;
                break;
            }else{
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }
    class ListNode{
        int val;
        ListNode next;

        public ListNode(){}
        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


