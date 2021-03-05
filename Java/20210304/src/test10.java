public class test10 {
}

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

// 快慢指针：
class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while (slow != null && fast != null && fast.next != null){
            if (fast == slow)
                return true;
            else{
                fast = fast.next.next;
                slow = slow.next;
            }
        }
        return false;
    }
}

/*
// 哈希表：
class Solution {
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
*/
