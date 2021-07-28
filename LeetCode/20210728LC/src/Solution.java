import java.util.List;

public class Solution {
    // 重排序
    public void reorderList(ListNode head){
        if (head == null || head.next == null){
            return;
        }

        // 找到中间结点
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        // 反转后半段结点
        ListNode cur2 = slow.next;
        slow.next = null;
        ListNode pre = null;
        while (cur2 != null){
            ListNode tmp = cur2.next;
            cur2.next = pre;
            pre = cur2;
            cur2 = tmp;
        }

        // 合并两条链表
        ListNode cur1 = head;
        cur2 = pre;
        while (cur1 != null && cur2 != null){
            ListNode a = cur1.next;
            ListNode b = cur2.next;
            cur1.next = cur2;
            cur1 = a;
            cur2.next = cur1;
            cur2 = b;
        }

    }
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode() { }
    }
}
