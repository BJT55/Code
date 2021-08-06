public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy= new ListNode(0);
        ListNode pre = dummy;
        ListNode cur = head;

        while (cur != null && cur.next != null){
            ListNode tmp = cur.next;
            cur.next = tmp.next;
            pre.next = tmp;
            tmp.next = cur;

            pre = cur;
            cur = cur.next;
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
