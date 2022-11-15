package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_101 {


    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(left);
        queue.offer(right);
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
            queue.offer(poll2.right);
            queue.offer(poll2.right);
            queue.offer(poll1.left);

        }
        return true;
    }


}
