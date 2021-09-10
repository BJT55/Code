public class Solution206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode node = cur.next;
            cur.next = pre;
            pre = cur;
            cur = node;
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
