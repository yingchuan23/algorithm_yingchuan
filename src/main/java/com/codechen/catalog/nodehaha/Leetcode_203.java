package com.codechen.catalog.nodehaha;

import com.codechen.catalog.utils.ListNode;

import java.util.List;

public class Leetcode_203 {

    //添加虚拟节点的方式
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        ListNode current = head;

        while (current != null) {
            if (current.val == val) {
                pre.next = current.next;
            } else {
                pre = current;
            }
            current = current.next;

        }
        return dummy.next;
    }

}
