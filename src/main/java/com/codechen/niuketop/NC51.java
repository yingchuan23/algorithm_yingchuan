package com.codechen.niuketop;

import com.codechen.niuketop.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class NC51 {


    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists == null) {
            return null;
        }
        ListNode result = new ListNode(-1);

        for (int i = 0; i < lists.size(); i++) {
            result.next = getListNode(result.next, lists.get(i));
        }
        return result.next;
    }

    private ListNode getListNode(ListNode node1, ListNode node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }
        ListNode dummynode = new ListNode(-1);
        ListNode cur = dummynode;
        while (node1 != null && node2 != null) {
            if (node1.val >= node2.val) {
                cur.next = node2;
                node2 = node2.next;
            } else {
                cur.next = node1;
                node1 = node1.next;
            }
            cur = cur.next;
        }
        if (node1 == null) {
            cur.next = node2;
        }
        if (node2 == null) {
            cur.next = node1;
        }

        return dummynode.next;
    }



}
