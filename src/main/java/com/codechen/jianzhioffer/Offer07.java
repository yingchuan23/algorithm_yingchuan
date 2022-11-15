package com.codechen.jianzhioffer;

import com.codechen.niuketop.utils.TreeNode;

public class Offer07 {


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int preleft, int preright, int inleft, int inright) {
        if (preleft > preright) {
            return null;
        }
        int rootvalue = preorder[preleft];
        TreeNode root = new TreeNode(rootvalue);
        int rootindex = 0;
        for (int i = inleft; i <= inright; i++) {
            if (rootvalue == inorder[i]) {
                rootindex = i;
                break;
            }
        }


        root.left = buildTree(preorder, inorder, preleft + 1, preleft + (rootindex - inleft), inleft, rootindex - 1);
        root.right = buildTree(preorder, inorder, preleft + (rootindex - inleft) + 1, preright, rootindex + 1, inright);

        return root;
    }

}
