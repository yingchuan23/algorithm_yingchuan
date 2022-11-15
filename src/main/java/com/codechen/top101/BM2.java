package com.codechen.top101;

import com.codechen.catalog.utils.ListNode;

import java.util.List;

/*本题的思路是leetcode的官方题解
 *
 *
 * 本题是leetcode92*/
public class BM2 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        /*因为头节点 可能发生变化
         * 有可能头节点直接被反转了*/
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        /*首先我们 要寻找  我们思路定义的四个节点
         * 这个我们定义的这个节点  是我们要反转子链表的第一节点*/
        ListNode pre = dummyNode;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode leftNode = pre.next;
        /*现在我们要找的节点   是子链表的 右边的节点*/
        ListNode rightNode = pre;
        for (int i = 0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }

        /*然后记录下 我们的下一个节点 最后一个节点 就是要反转链表的最后一个节点的下一个节点*/
        ListNode postNode = rightNode.next;

        /*然后我们切断与切断一下链表*/
//        pre.next = null;
        rightNode.next = null;

        /*反转子链表*/
        reversehaha(leftNode);

        pre.next = rightNode;
        leftNode.next = postNode;
        return dummyNode.next;
    }

    private void reversehaha(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;

        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
    }
}
