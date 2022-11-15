package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.Stack;

public class Leetcode_617 {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }

        if (root2 == null) {
            return root1;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root2);
        stack.push(root1);
        while (!stack.isEmpty()) {
            TreeNode node1 = stack.pop();
            TreeNode node2 = stack.pop();
            node1.val += node2.val;
            if (node1.right != null && node2.right != null) {
                stack.push(node2.right);
                stack.push(node1.right);
            } else {
                if (node1.right == null) {
                    node1.right = node2.right;
                }
            }
            if (node1.left != null && node2.left != null) {
                stack.push(node2.left);
                stack.push(node1.left);
            }else {
                if (node1.left == null){
                    node1.left = node2.left;
                }
            }

        }
        return root1;
    }
}
