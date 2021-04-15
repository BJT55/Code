class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

class Solution22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head == null)
            return null;

        ListNode fast = head;
        ListNode slow = head;
        for(int i = 0; i < k; ++i){
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}