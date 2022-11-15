package com.codechen.niuketop;

import com.codechen.niuketop.utils.TreeNode;

public class NC6 {

    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGrain(root);
        return max;
    }

    private int maxGrain(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftgrain = Math.max(maxGrain(root.left), 0);
        int rightgrain = Math.max(maxGrain(root.right), 0);

        int temp = root.val + leftgrain + rightgrain;

        max = Math.max(max,temp);

        return root.val + Math.max(leftgrain,rightgrain);
    }
}
