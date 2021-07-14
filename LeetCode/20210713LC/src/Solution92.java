public class Solution92 {
/*    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        // 找到 left 结点的前一个结点
        for (int i = 1; i < left; ++i){
            pre = pre.next;
        }
        // head 为当前反转链表头结点, 即 left 的当前结点
        head = pre.next;
        for (int i = left; i < right; ++i){
            ListNode next = head.next;
            head.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
    }*/
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
