import java.util.ArrayList;
import java.util.Stack;

public class Solution06 {
    // 栈
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null){
            stack.push(cur.val);
            cur = cur.next;
        }

        int[] res = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()){
            res[i++] = stack.pop();
        }
        return res;
    }

    // 反转链表
    public int[] reversePrint02(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        ListNode cur = head;
        int size = 0;
        while (cur != null){
            size++;
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        int[] res = new int[size];
        int i = 0;
        while (pre != null && i < size){
            res[i++] = pre.val;
            pre = pre.next;
        }
        return res;
    }

    // 递归
    ArrayList<Integer> tmp = new ArrayList<>();
    public int[] reversePrint03(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        for (int i = 0; i < res.length; i++){
            res[i] = tmp.get(i);
        }
        return res;
    }
    private void recur(ListNode head) {
        if (head == null) return;
        recur(head.next);
        tmp.add(head.val);
    }

    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
