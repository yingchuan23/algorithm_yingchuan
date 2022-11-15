package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

public class Leetcode_105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode buildTree(int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight) {
        // 没有元素了
        if (inRight - inLeft < 1) {
            return null;
        }
        if (inRight - inLeft == 1) {
            return new TreeNode(inorder[inLeft]);
        }
        int rootVal = preorder[preLeft];
        int rootIndex = 0;
        TreeNode root = new TreeNode(rootVal);
        for (int i = 0; i < inRight; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        root.left = buildTree(preorder, preLeft + 1, preLeft + (rootIndex - inLeft), inorder, inLeft, rootIndex);
        root.right = buildTree(preorder, preLeft + (rootIndex - inLeft) + 1, preRight, inorder, rootIndex + 1, inRight);
        return root;
    }
}
