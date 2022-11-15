package com.codechen.jianzhioffer;

import com.codechen.catalog.utils.Node;

public class Offer36 {

    Node head, pre;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return root;
        }
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }


    public void dfs(Node cur) {
        if (cur == null) {
            return;
        }
        dfs(cur.left);
        if (pre == null) {
            head = cur;
        } else {
            pre.right = cur;
        }

        cur.left = pre;

        pre = cur;

        dfs(cur.right);
    }
}
