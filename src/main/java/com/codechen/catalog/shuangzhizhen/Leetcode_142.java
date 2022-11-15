package com.codechen.catalog.shuangzhizhen;

import com.codechen.catalog.utils.ListNode;

public class Leetcode_142 {


    public ListNode detectCycle(ListNode head) {


        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            /*当有环的时候*/
            while (slow == fast) {
                ListNode index1 = fast;
                ListNode index2 = head;
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }

        }

        return null;
    }


}
