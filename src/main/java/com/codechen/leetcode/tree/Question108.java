package com.codechen.leetcode.tree;

import com.codechen.leetcode.utils.TreeNode;

/**
 * @description: todo
 * @author: CodeJ
 * @create: 2021-07-12 03:27
 **/
public class Question108 {


    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        /*进行递归*/
        root.left = helper(nums,left,mid-1);
        root.right = helper(nums, mid + 1, right);

        return root;

    }
}
