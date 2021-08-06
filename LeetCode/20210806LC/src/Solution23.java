import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (ListNode node : lists){
            if (node == null){
                continue;
            }
            queue.offer(node);
        }

        while (!queue.isEmpty()){
            ListNode next = queue.poll();
            cur.next = next;
            cur = cur.next;
            if (next.next != null){
                queue.add(next.next);
            }
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
