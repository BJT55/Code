import java.util.HashSet;
import java.util.Set;

// 给定一个链表，判断链表中是否有环。
public class test141 {

}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/*

// 方法一：龟兔赛跑（快慢指针）
class Solution141 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode p1 = head;
        ListNode p2 = head.next;
        while( p2 != p1 ){
            if( p2 == null || p2.next == null ){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return true;
    }
}

*/


// 方法二：哈希表
//（如果该节点已经存在于哈希表中，则说明该链表是环形链表，否则就将该节点加入哈希表中。）
class Solution141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> hash = new HashSet<>();
        while (head != null){
            if (!hash.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}