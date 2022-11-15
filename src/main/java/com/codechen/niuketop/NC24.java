package com.codechen.niuketop;

import com.codechen.niuketop.utils.ListNode;

public class NC24 {

    /*删除顺序链表中的重复元素*/
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode cur = dummyNode;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }
        return dummyNode.next;

    }

    /*牛客*/
    public ListNode deleteDuplicates1(ListNode head) {
        // write code here
        if (head == null) {
            return head;
        }
        ListNode dummynode = new ListNode(-1);

        dummynode.next = head;

        ListNode cur = dummynode;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }
        return dummynode.next;
    }
}
