public class Solution148 {
    public ListNode sortList(ListNode head) {
        return sortList(head,null);
    }

    private ListNode sortList(ListNode head, ListNode tail) {
        if (head == null) return head;

        if (head.next == tail){
            head.next = null;
            return head;
        }

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
        ListNode sorted = merge(list1,list2);
        return sorted;
    }

    private ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tmp = dummy, t1 = list1, t2 = list2;

        while (t1 != null && t2 != null){
            if (t1.val <= t2.val){
                tmp.next = t1;
                t1 = t1.next;
            }else {
                tmp.next = t2;
                t2 = t2.next;
            }
            tmp = tmp.next;
        }

        if (t1 != null){
            tmp.next = t1;
        }
        if (t2 != null){
            tmp.next = t2;
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
