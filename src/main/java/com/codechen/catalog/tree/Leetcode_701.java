package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

public class Leetcode_701 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode newRoot = root;
        /*定义一个节点用来记录上一个节点*/
        TreeNode pre = root;
        while (root != null) {
            pre = root;
            if (root.val > val) {
                root = root.left;
            } else if (root.val < val) {
                root = root.right;
            }
        }
        /*这个地方用pre   因为上面判断是空节点了*/
        if (pre.val > val) {
            pre.left = new TreeNode(val);
        }
        if (pre.val < val) {
            pre.right = new TreeNode(val);
        }
        return newRoot;
    }
}
