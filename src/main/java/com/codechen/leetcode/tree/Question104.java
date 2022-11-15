package com.codechen.leetcode.tree;

import com.codechen.leetcode.utils.TreeNode;

/**
 * @description: 求二叉树的深度  这个本解题的方法是深度优先搜索 就是递归
 * @author: CodeJ
 * @create: 2021-07-08 21:34
 **/
public class Question104 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftnumber = maxDepth(root.left);
            int rightnumber = maxDepth(root.right);
            return Math.max(leftnumber, rightnumber) + 1;
        }
    }

}
