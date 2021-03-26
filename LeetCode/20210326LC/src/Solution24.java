
class Solution24{
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;

        ListNode pre = null;
        ListNode cur = head;
        ListNode next ;
        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public ListNode reverseList02(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode newNode = reverseList02(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

}