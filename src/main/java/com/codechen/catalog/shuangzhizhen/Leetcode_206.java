package com.codechen.catalog.shuangzhizhen;

import com.codechen.catalog.utils.ListNode;

public class Leetcode_206 {

    public ListNode reverseList(ListNode head) {
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
