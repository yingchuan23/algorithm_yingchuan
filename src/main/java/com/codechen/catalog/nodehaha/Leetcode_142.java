package com.codechen.catalog.nodehaha;

import com.codechen.catalog.utils.ListNode;

import java.util.List;

public class Leetcode_142 {


    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;

        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            /*找到环了*/
            while (slow == fast) {
                ListNode index1 = fast;
                ListNode index2 = head;

                /*这个是根据一个公式*/
                while (index2 != index1) {
                    index2 = index2.next;
                    index1 = index1.next;
                }
                return index2;
            }

        }
        return null;
    }

}
