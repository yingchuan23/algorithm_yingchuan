package com.codechen.jianzhioffer;

import com.codechen.niuketop.utils.ListNode;

public class Offer_2_26 {

    /*1、找到中间节点
     * 2、反转后半段的链表
     * 3、合并链表*/
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode midNode = findmid(head);
        ListNode qian = head;
        ListNode hou = midNode.next;
        midNode.next = null;

        ListNode reversenode = reversenode(hou);

        mergeList(qian, reversenode);

    }

    public void mergeList(ListNode head1, ListNode head2) {
        ListNode head1temp;
        ListNode head2temp;
        while (head1 != null && head2 != null) {
            head1temp = head1.next;
            head2temp = head2.next;

            head1.next = head2;
            head1 = head1temp;

            head2.next = head1;
            head2 = head2temp;

        }
    }


    private ListNode reversenode(ListNode head) {
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

    private ListNode findmid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
