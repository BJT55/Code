public class Solution18 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return head.next;

        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null){
            if (cur.val == val){
                pre.next = cur.next;
                break;
            }
            pre = cur;
            cur = cur.next;
        }
        return head;
    }

    public void deleteNode(ListNode node) {
        while (node.next != null){
            ListNode tmp = node.next;
            node = tmp;
        }
    }

    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
