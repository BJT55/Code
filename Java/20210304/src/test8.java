public class test8 {
}

/*
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/


// O(N):
class PalindromeList {
    public boolean chkPalindrome(ListNode A) {
        if (A == null) return true;
        if (A.next == null) return true;

        // 复制链表
        ListNode newHead = new ListNode(0);
        ListNode newTail = newHead;
        for (ListNode cur = A; cur != null; cur = cur.next){
            newTail.next = new ListNode(cur.val);
            newTail = newTail.next;
        }

        // 链表逆置
        ListNode B = newHead.next;
        ListNode pre = null;
        ListNode cur = B;
        while (cur != null){
            ListNode next = cur.next;
            if (next == null){
                B = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        ListNode cur1 = A;
        ListNode cur2 = B;
        while (cur1 != null && cur2 != null){
            if (cur1.val != cur2.val)
                return false;
            else {
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
        }
        return true;
    }
}


/*
// O(1)版本：
class PalindromeList {
    public int getLength(ListNode head){
        int len = 0;
        for (ListNode cur = head; cur != null; cur = cur.next){
            len++;
        }
        return len;
    }

    public boolean chkPalindrome(ListNode A) {
        if (A == null) return true;
        if (A.next == null) return true;

        int len = getLength(A);
        int mid = len/2;
        ListNode B = A;
        for (int i = 0; i < mid; ++i){
            B = B.next;
        }

        ListNode pre = null;
        ListNode cur = B;
        while (cur != null){
            ListNode next = cur.next;
            if (next == null)
                B = cur;

            cur.next = pre;
            pre = cur;
            cur = next;
        }

        ListNode cur1 = A;
        ListNode cur2 = B;
        while (cur1 != null && cur2 != null){
            if (cur1.val != cur2.val)
                return false;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return true;
    }
}*/
