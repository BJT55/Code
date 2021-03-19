/*
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class Solution06LC {
    public int[] reversePrint(ListNode head) {
        if(head == null)
            return new int[0];

        int len = 0;
        ListNode cur = head;
        while(cur != null){
            len++;
            cur = cur.next;
        }

        int[] nums = new int[len];
        cur = head;
        while(cur != null){
            nums[len-1] = cur.val;
            len--;
            cur = cur.next;
        }
        return nums;
    }
}
*/
