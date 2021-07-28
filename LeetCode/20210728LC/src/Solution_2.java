import java.util.ArrayList;
import java.util.List;

public class Solution_2 {
    // 重排序
    public void reorderList(ListNode head){
        if (head == null){
            return;
        }

        List<ListNode> list = new ArrayList<>();
        while (head != null){
            list.add(head);
            head = head.next;
        }

        int i = 0, j = list.size()-1;
        while (i < j){
            list.get(i).next = list.get(j);
            i++;
            if (i == j){
                break;
            }
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
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
