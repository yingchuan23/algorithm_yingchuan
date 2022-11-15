package com.codechen.top101;

import com.codechen.catalog.utils.ListNode;

import java.util.List;

// STOPSHIP: 2022/3/5
/*牛客版
 * 这个和leetcode一样
 * 就是方法名不一样*/
public class BM2_2 {


    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write code here
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        /*然后我们就是寻找第一个节点*/
        ListNode pre = dummyNode;
        for (int i = 0; i < m - 1; i++) {
            pre = pre.next;
        }
        /*确定left节点*/
        ListNode leftNode = pre.next;

        ListNode rightNode = pre;
        /*确定右节点*/
        for (int i = 0; i < n - m + 1; i++) {
            rightNode = rightNode.next;
        }

        /*现在定义最后一个顶点*/
        ListNode postNode = rightNode.next;

        /*切断最后一个节点*/
        rightNode.next = null;

        reversedudu(leftNode);

        pre.next = rightNode;
        leftNode.next = postNode;

        return dummyNode.next;
    }


    private void reversedudu(ListNode head) {
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

    public static void main(String[] args) {
        ListNode dummyNode = new ListNode(-1);
        ListNode pre = dummyNode;
        ListNode listNode = new ListNode(6);
        pre.next = listNode;
        System.out.println(dummyNode.next.val);

    }
}
