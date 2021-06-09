class Solution148 {
    public ListNode sortList(ListNode head) {
        return sortList(head,null);
    }

    private ListNode sortList(ListNode head, ListNode tail) {
        if (head == null){
            return head;
        }
        if (head.next == tail){
            head.next = null;
            return head;
        }
        // 快慢指针, 找到链表的中点slow, 将链表分成两个
        ListNode slow = head, fast = head;
        while (fast != tail){
            slow = slow.next;
            fast = fast.next;
            if (fast != tail){
                fast = fast.next;
            }
        }

        ListNode mid = slow;
        ListNode list1 = sortList(head,mid);
        ListNode list2 = sortList(mid,tail);
        ListNode sortList = mergeSort(list1,list2);
        return sortList;
    }

    private ListNode mergeSort(ListNode head1, ListNode head2) {
        ListNode newHead = new ListNode(0);
        ListNode tmp = newHead, tmp1 = head1, tmp2 = head2;
        while (tmp1 != null && tmp2 != null){
            if (tmp1.val < tmp2.val){
                tmp.next = tmp1;
                tmp1 = tmp1.next;
            }else {
                tmp.next = tmp2;
                tmp2 = tmp2.next;
            }
            tmp = tmp.next;
        }

        if (tmp1 != null){
            tmp.next = tmp1;
        }
        if (tmp2 != null){
            tmp.next = tmp2;
        }
        return newHead.next;
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