//删除链表中等于给定值 val 的所有节点。
public class test203 {

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
// 方法一：先判断头结点，在判断一点结点
class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return null;
        }
        while(head.val == val){
            head = head.next;
            if(head == null){
                return null;
            }
        }
        ListNode prev = head;
        ListNode cur = head.next;
        while (cur != null){
            if (cur.val == val){
                prev.next = cur.next;
                cur = prev.next;
            }else{
                prev = prev.next;
                cur = cur.next;
            }
        }
        return head;
    }
}
*/


// 方法二：先删除一般结点，再判断是否删除头结点
class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return null;
        }
        ListNode prev = head;
        ListNode cur = head.next;
        while (cur != null){
            if (cur.val == val){
                prev.next = cur.next;
                cur = prev.next;
            }else{
                prev = prev.next;
                cur = cur.next;
            }
        }
        if(head.val == val){
            head = head.next;
        }
        return head;
    }
}
