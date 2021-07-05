
class Solution24_2 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode tmp = dummyHead;

        while (tmp.next != null && tmp.next.next != null){
            ListNode node1 = tmp.next;
            ListNode node2 = tmp.next.next;
            tmp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            tmp = node1;
        }
        return dummyHead.next;
    }
    class ListNode{
        int val;
        ListNode next;

        public ListNode(){}
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}