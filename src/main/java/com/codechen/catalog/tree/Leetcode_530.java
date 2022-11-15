package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.Stack;

public class Leetcode_530 {

    public int getMinimumDifference(TreeNode root) {


        if (root == null) {
            return 0;
        }
        TreeNode pre = null;
        Stack<TreeNode> stack = new Stack<>();
        int maxValue = Integer.MAX_VALUE;
        stack.push(root);
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                if (pre != null) {
                    maxValue = Math.min(maxValue, root.val - pre.val);
                }
                pre = root;
                root = root.right;
            }
        }
        return maxValue;
    }
}
