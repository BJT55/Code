public class Solution92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode pre = dummy;
        // pre 走到 left 结点的前一个
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode rightNode = pre;
        // rightNode 走到 right 结点
        for (int i = 0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }

        ListNode leftHead = pre.next;  // 切断的链表的头结点
        ListNode curr = rightNode.next;  // 切断的链表尾结点的下一个

        // 切断链表
        pre.next = null;
        rightNode.next = null;

        // 反转链表
        reverseList(leftHead);

        // 回到原来的链表中
        pre.next = rightNode;
        leftHead.next = curr;
        return dummy.next;
    }
    private void reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
