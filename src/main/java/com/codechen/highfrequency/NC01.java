package com.codechen.highfrequency;

import com.codechen.catalog.utils.ListNode;

import java.util.List;

public class NC01 {

    public ListNode ReverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return  pre;

    }

    public static void main(String[] args) {

        Object o = new Object();
    }
}
