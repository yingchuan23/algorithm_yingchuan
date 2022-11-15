package com.codechen.leetcode.tree;

import com.codechen.leetcode.utils.TreeNode;

/**
 * @className: com.codechen.leetcode.tree.Question226
 * @description: 反转二叉树  226
 * @author: CodeJ
 * @create: 2021-07-12 10:10
 */
public class Question226 {


    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;

    }


}
