public class Solution18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return head.next;

        ListNode cur = head;
        ListNode pre = head;
        while (cur != null){
            if (cur.val != val){
                pre = cur;
                cur = cur.next;
            }else {
                pre.next = cur.next;
                break;
            }
        }
        return head;
    }
    public ListNode deleteNode02(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return head.next;
        head.next = deleteNode(head.next,val);
        return head;
    }
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
