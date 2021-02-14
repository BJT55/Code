import java.util.ArrayList;
import java.util.List;

public class test234 {

}

/*
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

*/

/*
// 方法一：
class Solution234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        ListNode curNode = head;
        while(curNode != null){
            vals.add(curNode.val);
            curNode = curNode.next;
        }
        int front = 0;
        int back = vals.size() - 1;
        while (front < back){
            if (!vals.get(front).equals(vals.get(back))){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
*/
/*
// 方法二：(更快，内存占用更小)
class Solution234 {
    // 找到前半部分链表的尾结点
    public ListNode endOfFirstHalf(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    // 翻转链表
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode firstHalf = endOfFirstHalf(head);
        ListNode secongHalf = reverseList(firstHalf.next);

        // 判断是否为回文
        ListNode p1 = head;
        ListNode p2 = secongHalf;
        boolean ret = true;
        while (ret && p2 != null){
            if (p1.val != p2.val) ret = false;
            p1 = p1.next;
            p2 = p2.next;
        }
        // 还原链表
        firstHalf.next = reverseList(secongHalf);
        return ret;
    }
}
*/
