package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || q.val != p.val) {
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(p);
        queue.offer(q);

        while (!queue.isEmpty()) {
            TreeNode poll1 = queue.poll();
            TreeNode poll2 = queue.poll();

            if (poll1 == null && poll2 == null) {
                continue;
            }

            if (poll1 == null || poll2 == null || poll2.val != poll1.val) {
                return false;
            }

            queue.offer(poll1.left);
            queue.offer(poll2.left);
            queue.offer(poll1.right);
            queue.offer(poll2.right);

        }

        return true;
    }
}
