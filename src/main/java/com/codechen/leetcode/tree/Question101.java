package com.codechen.leetcode.tree;

import com.codechen.leetcode.utils.TreeNode;

/**
 * @description: 对称二叉树
 * @author: CodeJ
 * @create: 2021-07-04 19:38
 **/
public class Question101 {

    public boolean isSymmetric(TreeNode root) {

        return check(root, root);


    }

    private boolean check(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        }
        if (l == null || r == null) {
            return false;
        }

        return (l.val == r.val && check(l.left,r.right) && check(l.right,r.left));

    }


}
