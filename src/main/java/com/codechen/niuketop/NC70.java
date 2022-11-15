package com.codechen.niuketop;

import com.codechen.niuketop.utils.ListNode;

public class NC70 {

    public ListNode sortInList(ListNode head) {
        // write code here
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;
            while (temp != null) {
                if (temp.val < cur.val) {
                    int tempval = cur.val;
                    cur.val = temp.val;
                    temp.val = tempval;
                }
                temp = temp.next;
            }
            cur = cur.next;
        }
        return head;
    }

}
