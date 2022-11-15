package com.codechen.niuketop;

import com.codechen.niuketop.utils.TreeNode;

public class NC5 {

    public int sumNumbers(TreeNode root) {
        // write code here
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int presum) {
        if (root == null) {
            return 0;
        }
        int sum = presum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        } else {

            return dfs(root.left, sum) + dfs(root.right, sum);
        }

    }
}
