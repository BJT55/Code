import java.util.List;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        if (l1 == null){
            cur.next = l2;
            return dummy.next;
        }
        if(l2 == null){
            cur.next = l1;
            return dummy.next;
        }

        int carry = 0;
        while(l1 != null && l2 != null){
            int num = l1.val + l2.val + carry;
            carry = num/10;
            ListNode node = new ListNode(num%10);
            cur.next = node;
            cur = cur.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int num = l1.val + carry;
            carry = num/10;
            ListNode node = new ListNode(num%10);
            cur.next = node;
            cur = cur.next;
            l1 = l1.next;
        }

        while(l2 != null){
            int num = l2.val + carry;
            carry = num/10;
            ListNode node = new ListNode(num%10);
            cur.next = node;
            cur = cur.next;
            l2 = l2.next;
        }

        if(carry != 0){
            cur.next = new ListNode(carry);
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
