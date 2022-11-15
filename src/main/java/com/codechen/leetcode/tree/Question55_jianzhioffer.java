package com.codechen.leetcode.tree;

import com.codechen.leetcode.utils.TreeNode;

/**
 * @description: todo
 * @author: CodeJ
 * @create: 2021-07-01 20:54
 **/
public class Question55_jianzhioffer {

    
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        return Math.abs(l - r) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }


    //已传入为根节点  看这个树的深度
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = maxDepth(root.left);
        int r = maxDepth(root.right);


        if (l - r > 0) {
            return l + 1;
        }

        return r + 1;

    }
}
