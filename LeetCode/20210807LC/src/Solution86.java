public class Solution86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;

        ListNode small = new ListNode(0);
        ListNode smallHead = small;
        ListNode big = new ListNode(0);
        ListNode bigHead = big;
        ListNode cur = head;
        while (cur != null){
            if (cur.val < x){
                small.next = cur;
                small = small.next;
            }else {
                big.next = cur;
                big = big.next;
            }
        }
        small.next = bigHead.next;
        big.next = null;
        return small.next;
    }
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
