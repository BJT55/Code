public class Solution92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        for (int i = 0; i < left-1; i++){
            pre = pre.next;
        }
        // 此时 pre 为 left 的前一个结点
        ListNode cur = pre.next; // cur 为 left 的结点
        ListNode next;
        for (int i = 0; i < right-left; i++){
            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
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
