package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> queVal = new LinkedList<Integer>();
        queue.offer(root);
        queVal.offer(root.val);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            int temp = queVal.poll();

            if (node.left == null && node.right == null) {
                if (temp == targetSum) {
                    return true;
                }
                continue;
            }

            if (node.left != null) {
                queue.offer(node.left);
                queVal.offer(node.left.val + temp);
            }

            if (node.right != null) {
                queue.offer(node.right);
                queVal.offer(node.right.val + temp);
            }

        }
        return false;
    }

}
