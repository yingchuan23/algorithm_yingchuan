package com.codechen.jianzhioffer;

import com.codechen.niuketop.utils.TreeNode;

public class Offer54 {

    int res, k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    public void dfs(TreeNode cur) {
        if (cur == null) {
            return;
        }
        dfs(cur.right);
        if (k == 0) {
            return;
        }
        k--;

        if (k == 0) {
            res = cur.val;
        }

        dfs(cur.left);
    }


}
