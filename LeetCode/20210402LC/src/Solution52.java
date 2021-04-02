class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
class Solution52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while(a != b){
            a = a == null ? headA : a.next;
            b = b == null ? headB : b.next;
        }
        return a;
    }

    public ListNode getIntersectionNode02(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        ListNode a = headA, b = headB;
        while (a != null){
            lenA++;
            a = a.next;
        }
        while (b != null){
            lenB++;
            b = b.next;
        }
        a = headA;
        b = headB;
        if(lenA > lenB){
            for(int i = 0; i < lenA-lenB; ++i){
                a = a.next;
            }
        }else if(lenB > lenA){
            for(int i = 0; i < lenB-lenA; ++i){
                b = b.next;
            }
        }

        while(a != b){
            a = a.next;
            b = b.next;
        }
        return a;
    }
}