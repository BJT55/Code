import java.util.Deque;
import java.util.LinkedList;

public class JZ06 {
    public int[] reversePrint(ListNode head) {
        Deque<Integer> deque = new LinkedList<>();
        while (head != null){
            deque.addFirst(head.val);
            head = head.next;
        }
        int[] res = new int[deque.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = deque.pollFirst();
        }
        return res;
    }
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
