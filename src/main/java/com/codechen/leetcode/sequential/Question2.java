package com.codechen.leetcode.sequential;

import com.codechen.leetcode.utils.ListNode;

/**
 * @description: leetcode_两数相加
 * @author: CodeJ
 * @create: 2021-05-23 22:37
 **/
// ok
public class Question2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;

        while (head1 != null) {
            if (head2 != null) {
                head1.val += head2.val;
                head2 = head2.next;
            }
            // l2>l1
            if (head1.next == null  && head2 != null ){
                head1.next = head2;
                break;
            }

            head1 = head1.next;
        }
        merge(l1);
        return l1;
    }

    /*进位*/
    private void merge(ListNode head) {
        while (head != null) {
            if (head.val >= 10) {
                head.val = head.val % 10;
                // 当head需要进位且没有下一位的时候
                if (head.next == null){
                    head.next = new ListNode(0);
                }
                head.next.val += 1;
            }
            head = head.next;
        }
    }


}
