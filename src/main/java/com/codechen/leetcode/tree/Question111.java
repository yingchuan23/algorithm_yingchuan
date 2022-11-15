package com.codechen.leetcode.tree;

import com.codechen.leetcode.utils.TreeNode;

import javax.imageio.stream.ImageInputStream;

/**
 * @className: com.codechen.leetcode.tree.Question111
 * @description: 111二叉树的最小深度  真的是很爽  用递归写
 * @author: CodeJ
 * @create: 2021-07-12 1:03
 */

public class Question111 {


    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        int min_len = Integer.MAX_VALUE;
        if (root.left != null) {
            min_len =  Math.min(minDepth(root.left), min_len);
        }
        if (root.right != null) {
            min_len =  Math.min(minDepth(root.right), min_len);
        }

        return min_len + 1;

    }


}
