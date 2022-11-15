package com.codechen.niuketop;

import com.codechen.catalog.utils.ListNode;

import java.util.List;

public class NC50 {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyNode = new ListNode(-1);

        dummyNode.next = head;
        ListNode pre = dummyNode;

        while (head != null) {
            ListNode tail = pre;
            for (int i = 0; i < k; i++) {
                tail = tail.next;
                if (tail == null) {
                    return dummyNode.next;
                }
            }

            ListNode next = tail.next;

            tail.next = null;

            ListNode[] reversedudu = reversedudu(head);
            head = reversedudu[0];
            tail = reversedudu[1];

            /*然后把链表重新连接上*/
            pre.next = head;
            tail.next = next;

            pre = tail;
            head = tail.next;
        }
        return dummyNode.next;

    }

    /*反转一下链表*/
    private ListNode[] reversedudu(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        return new ListNode[]{pre, head};
    }
}
