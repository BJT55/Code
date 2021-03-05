public class test7 {
}
/*
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
class Delete {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null) return null;
        if(pHead.next == null) return pHead;

        ListNode newHead = new ListNode(0);
        ListNode newTail = newHead;
        ListNode cur = pHead;
        while(cur != null ){
            if( cur.next != null&&cur.val == cur.next.val ){
                while (cur != null && cur.next != null
                && cur.val == cur.next.val){
                    cur = cur.next;
                }
            }else {
                newTail.next = new ListNode(cur.val);
                newTail = newTail.next;
            }
            cur = cur.next;
        }
        return pHead;
    }
}*/
