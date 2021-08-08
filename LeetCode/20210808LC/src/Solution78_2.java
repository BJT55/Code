public class Solution78_2 {
    public ListNode ReverseList(ListNode head) {
        if (head == null) return null;

        ListNode pre = null;
        ListNode next;
        ListNode cur = head;
        while (cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
