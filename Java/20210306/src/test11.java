public class test11 {

}

//Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
}
class Solution142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        // 得到环内某结点
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        // 链表不带环
        if (fast == null || fast.next == null)
            return null;

        ListNode cur1 = head;
        ListNode cur2 = slow;
        while (cur1 != cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }
}