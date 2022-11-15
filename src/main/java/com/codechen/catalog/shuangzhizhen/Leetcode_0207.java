package com.codechen.catalog.shuangzhizhen;

import com.codechen.catalog.utils.ListNode;

public class Leetcode_0207 {

    /*这个是leetcode题解 */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode A = headA;
        ListNode B = headB;
        while (A != B) {
            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;
        }
        return A;
    }
}
