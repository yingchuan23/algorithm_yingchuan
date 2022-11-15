package com.codechen.catalog.nodehaha;

import com.codechen.catalog.utils.ListNode;


/*给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
* */
public class Leetcode_19 {


    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);

        dummy.next = head;

        ListNode fast = dummy;

        ListNode slow = dummy;

        while (n-- > 0) {
            fast = fast.next;
        }

        ListNode pre = null;
        while (fast != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }

        pre.next = slow.next;

        slow.next = null;


        return dummy.next;
    }
}
