package com.codechen.leetcode.tree;

import com.codechen.leetcode.utils.TreeNode;

/**
 * @description: 112. 路径总和 练习使用的递归
 * @author: CodeJ
 * @create: 2021-07-11 20:25
 **/
public class Question105 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        if (root.left == null && root.right ==null){
            return targetSum == root.val;
        }

        return hasPathSum(root.left ,targetSum-root.val) || hasPathSum(root.right,targetSum - root.val );

    }
}
