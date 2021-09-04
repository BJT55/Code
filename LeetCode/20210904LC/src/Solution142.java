public class Solution142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode fast = head;
        ListNode slow = head;
        while (true){
            if (fast == null || fast.next == null){
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                break;
            }
        }
        slow = head;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
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
