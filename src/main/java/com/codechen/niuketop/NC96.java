package com.codechen.niuketop;

import com.codechen.niuketop.utils.ListNode;


public class NC96 {

    public boolean isPail(ListNode head) {
        // write code here
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }


        if (fast != null) {
            slow = slow.next;
        }

        ListNode mid = helper(slow);

        while (mid != null) {
            if (mid.val != head.val) {
                return false;
            }
            mid = mid.next;
            head = head.next;
        }

        return true;
    }

    private ListNode helper(ListNode head) {

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
