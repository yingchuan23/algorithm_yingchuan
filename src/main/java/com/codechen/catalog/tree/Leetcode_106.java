package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import static javax.swing.text.html.FormSubmitEvent.MethodType.POST;

public class Leetcode_106 {


    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    private TreeNode buildTree(int[] inorder, int inLeft, int inRight, int[] postorder, int postLeft, int postRight) {
        if (inRight - inLeft < 1) {
            return null;
        }
        if (inRight - inLeft == 1) {
            return new TreeNode(inorder[inLeft]);
        }
        // 后序数组postorder里最后一个即为根结点
        int rootVal = postorder[postRight - 1];

        TreeNode root = new TreeNode(rootVal);
        /*定义一个点， 这个子树root节点的值在中序遍历数组中的位置*/
        int rootIndex = 0;
        /*在中序便利中根节点的位置*/
        for (int i = inLeft; i < inRight; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        /*划分左右子树*/
        root.left = buildTree(inorder, inLeft, inRight, postorder, postLeft, postLeft + (rootIndex - postLeft));
        root.right = buildTree(inorder, inLeft, inRight, postorder, postLeft + (rootIndex - postLeft), postRight - 1);
        return root;
    }

}
