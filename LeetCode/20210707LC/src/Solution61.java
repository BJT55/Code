
public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0){
            return head;
        }
        int len = 1;  // 计算链表长度
        ListNode node = head;
        while (node.next != null){
            len++;
            node = node.next;
        }
        int loop = len - k % len;  // 循环次数
        if (loop == len){
            return head;
        }

        node.next = head;
        while (loop-- > 0){
            node = node.next;
        }
        ListNode newHead = node.next;
        node.next = null;
        return newHead;
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
