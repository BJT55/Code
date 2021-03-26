class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
class Solution22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head == null || k <= 0)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        // 先找到快结点的起始位置
        while(fast != null && k > 0){
            fast = fast.next;
            k--;
        }
        // 快慢结点一起向前走，直到快结点为 null 时，慢节点的位置为所要结点
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

