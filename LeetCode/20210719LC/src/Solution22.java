public class Solution22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head == null){
            return null;
        }

        ListNode fast = head;
        for(int i = 0; i < k; ++i){
            if(fast != null){
                fast = fast.next;
            }
            else{
                return null;
            }
        }
        ListNode slow = head;
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    class ListNode{
        int val;
        ListNode next;

        public ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
