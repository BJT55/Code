//反转一个单链表。
public class test206 {

}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/*
// 迭代遍历
class Solution206 {
    public ListNode reverseList(ListNode head) {
        // 无结点
        if(head == null){
            return null;
        }
        // 只有一个结点
        if(head.next == null){
            return head;
        }
        // 一般情况
        ListNode newHead = null;
        ListNode prevNode = null;
        ListNode curNode = head;
        while(curNode != null){
            ListNode nextNode = curNode.next;
            if(nextNode == null){
                newHead = curNode;
            }
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }
        return newHead;
    }
 */

// 递归：
class Solution206 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
