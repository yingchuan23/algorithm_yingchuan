package com.codechen.niuketop;

import com.codechen.niuketop.utils.ListNode;

import java.util.HashSet;
import java.util.Set;

public class NC3 {

    public ListNode EntryNodeOfLoop(ListNode pHead) {

        Set<ListNode> set = new HashSet<>();

        while (pHead != null) {
            if (set.contains(pHead)) {
                return pHead;
            } else {
                set.add(pHead);
            }
            pHead = pHead.next;
        }
        return null;
    }


    /*第二种解法*/
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode temp = head;
                while (fast != temp) {
                    fast = fast.next;
                    temp = temp.next;
                }
                return temp;
            }
        }
        return null;
    }
}
