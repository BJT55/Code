import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

class Solution06 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        while(cur != null){
            stack.push(cur.val);
            cur = cur.next;
        }

        int[] res = new int[stack.size()];
        for(int i = 0; i < res.length; ++i){
            res[i] = stack.pop();
        }
        return res;
    }

    List<Integer> list = new ArrayList<>();
    public int[] reversePrint02(ListNode head) {
        help(head);
        int[] res = new int[list.size()];
        for(int i = 0; i < res.length; ++i){
            res[i] = list.get(i);
        }
        return res;
    }
    void help(ListNode node){
        if(node == null)
            return;
        help(node.next);
        list.add(node.val);
    }
}