class Solution328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        // 奇数结点
        ListNode odd = head;
        // 偶数头结点,偶数节点
        ListNode evenHead = head.next;
        ListNode even = evenHead;
        while (odd != null && odd.next != null
                && even != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
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