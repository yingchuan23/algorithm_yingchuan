package com.codechen.jianzhioffer;

import com.codechen.niuketop.utils.TreeNode;

/**/
public class Offer68_1 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res = root;
        while (true) {
            if (p.val < res.val && q.val < res.val) {
                res = res.left;
            } else if (p.val > res.val && q.val > res.val) {
                res = res.right;
            } else {
                break;
            }
        }
        return res;
    }

}
