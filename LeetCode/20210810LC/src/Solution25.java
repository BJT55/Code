public class Solution25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;

        int len = 0;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        cur = head;
        for(int i = 0; i < len/k; i++){
            for (int j = 0; j < k-1; j++) {
                ListNode next = cur.next;
                cur.next = next.next;
                next.next = pre.next;
                pre.next = next;
            }
            pre = cur;
            cur = pre.next;
        }
        return dummy.next;
    }
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
