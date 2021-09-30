import java.util.Stack;

public class Solution445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null){
            stack1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode head = null;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry>0){
            int tmp = carry;
            tmp += stack1.isEmpty() ? 0 : stack1.pop();
            tmp += stack2.isEmpty() ? 0 : stack2.pop();
            ListNode node = new ListNode(tmp%10);
            node.next = head;
            head = node;
            carry = tmp/10;
        }
        return head;
    }
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
