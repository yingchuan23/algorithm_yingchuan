package com.codechen.niuketop;

import com.codechen.niuketop.utils.ListNode;

import java.util.List;

/*使用双指针*/
public class NC53 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummynode = new ListNode(-1);
        dummynode.next = head;
        ListNode fast = dummynode;
        ListNode slow = dummynode;

        while (n-- > 0) {
            fast = fast.next;
        }

        ListNode pre = null;
        while (fast != null) {
            pre = slow;
            fast = fast.next;
            slow = slow.next;
        }

        pre.next = slow.next;

        return dummynode.next;
    }

}
