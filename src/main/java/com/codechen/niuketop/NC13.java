package com.codechen.niuketop;

import com.codechen.niuketop.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class NC13 {


    /*这个是使用的层序遍历*/
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int result = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            result++;
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
        }
        return result;
    }


    /*我们这个地方使用递归试试*/
    public int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth1(root.left), maxDepth1(root.right)) + 1;
    }
}
