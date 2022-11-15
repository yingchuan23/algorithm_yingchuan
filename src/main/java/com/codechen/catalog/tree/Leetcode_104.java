package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_104 {


    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int res = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            res++;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
