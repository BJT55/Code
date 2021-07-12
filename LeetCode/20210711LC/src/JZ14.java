public class JZ14 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        int len = 0;
        ListNode slow = pHead;
        while (slow != null){
            slow = slow.next;
            len++;
        }

        if (pHead == null || k <= 0 || len < k){
            return null;
        }
        slow = pHead;
        ListNode fast = slow.next;
        while (slow != null && fast!= null && len - k > 0){
            slow = slow.next;
            fast = fast.next;
            k++;
        }
        return slow;
    }
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
