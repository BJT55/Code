public class test9 {
}

/*
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
*/

/*
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        for (ListNode curA = headA; curA != null; curA = curA.next){
            for (ListNode curB = headB; curB != null; curB = curB.next){
                if (curA == curB)
                    return curA;
            }
        }
        return null;
    }
}
*/


/*
class Solution {
    public int getLength(ListNode head){
        int len = 0;
        for (ListNode cur = head; cur != null; cur = cur.next){
            len++;
        }
        return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        int steps = 0;

        if (lenA > lenB){
            steps = lenA - lenB;
           for (int i = 0; i < steps; ++i){
               headA = headA.next;
           }
        }else{
            steps = lenB - lenA;
            for (int i = 0; i < steps; ++i){
                headB = headB.next;
            }
        }

        while (headA != null && headB != null){
            if (headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
*/
