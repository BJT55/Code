public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        if (k == 0) return head;

        ListNode tail = head, newTail = head;
        ListNode newHead;
        int len = 1;
        while (tail.next != null){
            tail = tail.next;
            len++;
        }
        tail.next = head;

        for (int i = 0; i < len - k%len -1; i++) {
            newTail = newTail.next;
        }
        newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
