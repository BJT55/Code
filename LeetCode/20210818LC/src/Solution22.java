public class Solution22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) return null;
        ListNode cur = head;
        for (int i = 0; i < k; i++) {
            if (cur != null){
                cur = cur.next;
            }else {
                return head;
            }
        }

        ListNode pre = head;
        while (cur != null){
            pre = pre.next;
            cur = cur.next;
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
