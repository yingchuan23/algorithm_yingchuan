package com.codechen.jianzhioffer;

import com.codechen.niuketop.utils.TreeNode;

public class Offer55_1 {


    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return helper(root);
    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(helper(root.left), helper(root.right)) + 1;
    }


}
