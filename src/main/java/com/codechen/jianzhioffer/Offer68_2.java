package com.codechen.jianzhioffer;

import com.codechen.niuketop.utils.TreeNode;


public class Offer68_2 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return helper(root, p.val, q.val);
    }

    private TreeNode helper(TreeNode root, int o1, int o2) {
        if (root == null || root.val == o1 || root.val == o2) {
            return root;
        }
        TreeNode left = helper(root.left, o1, o2);
        TreeNode right = helper(root.right, o1, o2);

        if (right == null && left == null) {
            return null;
        }
        if (right == null) {
            return left;
        }
        if (left == null) {
            return right;
        }
        return root;
    }


}
