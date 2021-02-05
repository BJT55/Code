// 合并两个有序链表
public class test21 {
    public static void main(String[] args) {
        ListNode l12 = new ListNode(4);
        ListNode l11 = new ListNode(2,l12);
        ListNode l1 = new ListNode(1,l11);

        ListNode l22 = new ListNode(4);
        ListNode l21 = new ListNode(3,l22);
        ListNode l2 = new ListNode(1,l21);

        Solution21 s = new Solution21();
        System.out.println(s.mergeTwoLists(l1,l2));

    }
}

/*
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return  val + " " + next + " ";
    }
}
*/

// 递归
/*
class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }else if (l2 == null){
            return l1;
        }else if (l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l2.next,l1);
            return l2;
        }

    }

}*/

// 迭代
class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(-1);

        ListNode prev = preHead;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        // 合并最后还未被合并完的元素（最多只有一个）
        prev.next = l1 == null ? l2 : l1;
        return preHead.next;
    }

}
