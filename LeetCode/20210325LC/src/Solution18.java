class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

class Solution18 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null)
            return null;
        while(head.val == val){
            head = head.next;
        }

        ListNode pre = head;
        ListNode cur = pre.next;
        while(pre != null && cur!= null){
            if(cur.val == val){
                pre.next = cur.next;
            }else {
                pre = pre.next;
            }
            cur = cur.next;
        }
        return head;
    }
}

class Solution18_2 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head == null)
            return null;
        if(head.val == val)
            return head.next;

        ListNode cur = head;
        while(cur.next != null && cur.next.val != val){
            cur = cur.next;
        }

        if(cur.next != null){
            cur.next = cur.next.next;
        }
        return head;
    }
}