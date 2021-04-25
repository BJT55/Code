
public class Solution23_2 {
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists,0,lists.length-1);
    }
    public ListNode merge(ListNode[] lists, int left, int right){
        if (left == right){
            return lists[left];
        }
        if (left > right){
            return null;
        }
        int mid = (left+right)/2;
        return mergeTwoLists(merge(lists,left,mid),merge(lists,mid+1,right));
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode newHead = new ListNode(0);
        ListNode tail = newHead;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                tail.next = l1;
                l1 = l1.next;
            }else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if (l1 == null)
            tail.next = l2;
        if (l2 == null)
            tail.next = l1;
        return newHead.next;
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
