//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
public class test83 {
    public static void main(String[] args) {

    }
}


class ListNode {
     int val;
     ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while( cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else cur = cur.next;
        }
        return head;
    }
}