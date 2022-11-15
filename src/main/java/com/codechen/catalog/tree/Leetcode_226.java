package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_226 {


    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return root;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode poll = queue.poll();
                TreeNode tmp = poll.left;
                poll.left = poll.right;
                poll.right = tmp;
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
                size--;
            }
        }
        return root;
    }


}
