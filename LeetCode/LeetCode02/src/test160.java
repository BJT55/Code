import javax.xml.soap.Node;
import java.util.HashSet;
import java.util.Set;

//
public class test160 {
    public static void main(String[] args) {

    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


// 蛮力法：（太耗时间了，848ms）
class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        for (ListNode a = headA; a != null; a = a.next){
            for (ListNode b = headB; b != null; b = b.next){
                if (b == a){
                    return b;
                }
            }
        }
        return null;
    }
}

