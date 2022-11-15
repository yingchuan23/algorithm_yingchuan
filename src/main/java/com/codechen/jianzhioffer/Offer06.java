package com.codechen.jianzhioffer;

import com.codechen.niuketop.utils.ListNode;

import java.util.Stack;

public class Offer06 {

    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }

        int size = stack.size();
        int[] ints = new int[size];
        for (int i = 0; i < size; i++) {
            ints[i] = stack.pop().val;
        }
        return ints;
    }

}
