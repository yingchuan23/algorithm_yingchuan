package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

public class Leetcode_654 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length);

    }

    private TreeNode constructMaximumBinaryTree(int[] nums, int left, int right) {
        if (right - left < 1) {
            return null;
        }
        if (right - left == 1) {
            return new TreeNode(nums[left]);
        }
        int maxIndex = left;
        int maxVal = nums[maxIndex];
        for (int i = left + 1; i < right; i++) {
            if (nums[i] > maxVal) {
                maxIndex = i;
                maxVal = nums[i];
            }
        }
        TreeNode root = new TreeNode(maxVal);
        root.left = constructMaximumBinaryTree(nums,left,maxIndex);
        root.right = constructMaximumBinaryTree(nums, maxIndex + 1, right);
        return root;
    }
}
