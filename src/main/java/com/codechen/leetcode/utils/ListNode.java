package com.codechen.leetcode.utils;

public class ListNode {
    public int val;
    /*shuzzhi*/

    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}