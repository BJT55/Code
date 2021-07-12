public class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(0,head);
        ListNode cur = dummy;

        while (cur.next != null && cur.next.next != null){
            if (cur.next.val == cur.next.next.val){
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x){
                    cur.next = cur.next.next;
                }
            }else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }
    class ListNode{
        int val;
        ListNode next;
        public ListNode(){};

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
