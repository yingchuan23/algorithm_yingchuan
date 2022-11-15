package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_111 {


    class QueueNode {
        TreeNode node;
        int depth;

        public QueueNode(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<QueueNode> queue = new LinkedList<QueueNode>();
        queue.offer(new QueueNode(root, 1));

        while (!queue.isEmpty()) {

            QueueNode poll = queue.poll();
            TreeNode node = poll.node;
            int depth = poll.depth;
            if (node.left == null && node.right == null) {
                return depth;
            }
            if (node.left != null) {
                queue.offer(new QueueNode(node.left, depth + 1));
            }
            if (node.right != null) {
                queue.offer(new QueueNode(node.right, depth + 1));
            }

        }
        return 0;
    }
}
