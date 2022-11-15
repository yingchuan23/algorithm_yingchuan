package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.Stack;

public class Leetcode_98 {


    /*利用中序便利*/
    public boolean isValidBST(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        double inorder = -Double.MAX_VALUE;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            while (root.val <= inorder) {
                return false;
            }
            inorder = root.val;
            root = root.right;
        }
        return true;
    }

}
