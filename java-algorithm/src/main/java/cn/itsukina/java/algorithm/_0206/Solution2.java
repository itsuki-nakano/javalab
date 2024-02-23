package cn.itsukina.java.algorithm._0206;


public class Solution2 {
    // 迭代
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = null;
        while (next != null) {
            ListNode next2 = next.next;
            next.next = head;
            head = next;
            next = next2;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Solution2 solution2 = new Solution2();
        solution2.reverseList(n1);
    }
}
