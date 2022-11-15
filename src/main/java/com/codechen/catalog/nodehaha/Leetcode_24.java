package com.codechen.catalog.nodehaha;

import com.codechen.catalog.utils.ListNode;

public class Leetcode_24 {

    public ListNode swapPairs(ListNode head) {


        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy;


        while (pre.next != null && pre.next.next != null) {
            ListNode tmp = head.next.next;
            pre.next = head.next;
            head.next.next = head;
            head.next = tmp;
            pre = head;
            head = head.next;
        }

        return dummy.next;
    }


}

