public class Solution142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        // 找到环内相遇的结点
        while (fast != null && fast.next != null){
            if (slow == fast) break;

            slow = slow.next;
            fast = fast.next.next;
        }

        // 如果链表不带环, 则返回 null
        if (fast == null || fast.next == null)
            return null;


        ListNode node1 = head;
        ListNode node2 = fast;
        while (node1 != node2){
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
    }
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
