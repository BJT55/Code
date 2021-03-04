package Class;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    }
}


class ListNode{
    int val;
    ListNode next;
    public ListNode(int x){
        val = x;
    }
}

class LinkedList{
    // 1.求中值
    public ListNode middledNode(ListNode head){
        if (head == null) return null;
        int len = getListLen(head);
        int middle = len / 2;
        ListNode cur = head;
        for (int i = 0; i < middle; ++i){
            cur = cur.next;
        }
        return cur;
    }

    public int getListLen(ListNode head){
        int len = 0;
        for (ListNode cur = head; cur.next != null; cur = cur.next){
            len++;
        }
        return len;
    }
    //2.找到倒数第k个数
    public ListNode FindKthToTall(ListNode head, int k){
        if (head == null) return null;
        int len = getListLen(head);
        if (k <= 0 || k > len) return null;

        int steps = len - k;
        ListNode cur = head;
        for (int i = 0; i < steps; ++i){
            cur = cur.next;
        }
        return cur;
    }

    //3. 按照顺序合并链表
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode newHead = null;
        ListNode newTail = null;//记录新链表的尾部，为方便尾插
        while (cur1 != null || cur2 != null){
            if(cur1.val <= cur2.val){
                if (newTail == null){
                    newHead = cur1;
                    newTail = newHead;
                }else {
                    newTail.next = cur1;
                    newTail = newTail.next;
                }
            }else {
                if (newTail == null){
                    newHead = cur2;
                    newTail = newHead;
                }else {
                    newTail.next = cur2;
                    newTail = newTail.next;
                }
            }
        }
        return newHead;
    }

    // 4.给定 x, 把一个链表整理成前半部分小于 x, 后半部分大于等于 x 的形式
    public ListNode partition(ListNode pHead, int x) {
        if (pHead == null) return null;
        if (pHead.next == null) return pHead;


        ListNode smallHead = new ListNode(0);
        ListNode smallTail = smallHead;
        ListNode largeHead = new ListNode(0);
        ListNode largeTail = largeHead;
        for (ListNode cur = pHead; cur != null; cur = cur.next){
            if (cur.val < x){
                smallTail.next = new ListNode(cur.val);
                smallTail = smallTail.next;
            }else {
                largeTail.next = new ListNode(cur.val);
                largeTail = largeTail.next;
            }
        }
        smallTail.next = largeHead.next;
        return smallHead.next;
    }
}


