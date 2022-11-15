package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;


/*
* 要么这两个树相等
要么这个树是左树的子树
要么这个树hi右树的子树
* */

public class Leetcode_572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }

        return isSameTree(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    // 这个就是LeetCode100 题的那个函数
    public boolean isSameTree(TreeNode s, TreeNode t) {
        // 同时为空 说明树一起到底，两树相同
        if (s == null && t == null) {
            return true;
        }
        // 如果上面没有返回值，说明必有一个没有为空（有可能两个都不为空）
        if (s == null || t == null) {
            return false;
        }
        // 如果判断到了这一步，说明两个都不为空
        // 先序遍历 自己--左 -- 右
        if (s.val != t.val) {
            return false;
        }
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }

}

