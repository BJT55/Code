public class Solution01 {
    public ListNode mergeSortedLinkedList(ListNode nodeA, ListNode nodeB) {
        // write code here
        if (nodeA == null) return nodeB;
        if (nodeB == null) return nodeA;

        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        ListNode a = nodeA, b = nodeB;
        while (a != null && b != null){
            if (a.val < b.val){
                cur.next = a;
                a = a.next;
            }else if (a.val == b.val){
                cur.next = a;
                a = a.next;
                b = b.next;
            }
            else {
                cur.next = b;
                b = b.next;
            }
            cur = cur.next;
        }
        while (a != null){
            cur.next = a;
            cur = cur.next;
            a = a.next;
        }
        while (b != null){
            cur.next = b;
            cur = cur.next;
            b = b.next;
        }
        return dummy.next;
    }
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
