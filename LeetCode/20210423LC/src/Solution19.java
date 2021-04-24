class Solution19 {
    class ListNode {
        int val;
        ListNode next;

        public ListNode(){ }
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        if(head.next == null && n == 1){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = head;
        for(int i = 0; i < n; ++i){
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        }
        while(fast != null){
            pre = slow;
            fast = fast.next;
            slow = slow.next;
        }
        pre.next = slow.next;
        return head;
    }

    public ListNode removeNthFromEnd02(ListNode head, int n){
        ListNode tmp = head;
        if (head == null || n < 1){
            return null;
        }
        while (tmp != null){
            n--;
            tmp = tmp.next;
        }

        if (n == 0){
            head = head.next;
        }
        if (n < 0){
            tmp = head;
            while (++n != 0){
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
        }
        return head;
    }
}