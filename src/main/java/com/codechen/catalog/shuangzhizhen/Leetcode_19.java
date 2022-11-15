package com.codechen.catalog.shuangzhizhen;

import com.codechen.catalog.utils.ListNode;

public class Leetcode_19 {


    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);

        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        while (n-- > 0) {
            fast = fast.next;
        }
        ListNode pre = null;
        while(fast != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }

        pre.next = slow.next;

        return head;
    }

}
