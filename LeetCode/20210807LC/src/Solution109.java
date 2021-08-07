public class Solution109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        else if (head.next == null) return new TreeNode(head.val);

        ListNode pre = head;
        ListNode cur = pre.next;
        ListNode next = cur.next;
        // 找到中间结点 cur
        while (next != null && next.next != null){
            pre = pre.next;
            cur = pre.next;
            next = next.next.next;
        }

        // 将中间结点左右边链表分开
        pre.next = null;
        TreeNode root = new TreeNode(cur.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(cur.next);
        return root;
    }
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}

