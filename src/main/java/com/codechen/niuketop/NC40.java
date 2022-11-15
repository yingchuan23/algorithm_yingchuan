package com.codechen.niuketop;

import com.codechen.niuketop.utils.ListNode;

import java.util.List;

public class NC40 {


    public ListNode addInList(ListNode head1, ListNode head2) {
        // write code here
        ListNode dummynode = new ListNode(-1);
        head1 = reverse(head1);
        head2 = reverse(head2);
        int carry = 0;
        while (head1 != null || head2 != null) {
            carry += head1 == null ? 0 : head1.val;
            carry += head2 == null ? 0 : head2.val;

            dummynode.next = new ListNode(carry % 10);
            carry = carry / 10;
            dummynode = dummynode.next;

            head1 = head1 == null ? null : head1.next;
            head2 = head2 == null ? null : head2.next;
        }

        if (carry > 0) {
            dummynode.next = new ListNode(carry);
        }

        ListNode reverse = reverse(dummynode.next);
        return reverse;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
