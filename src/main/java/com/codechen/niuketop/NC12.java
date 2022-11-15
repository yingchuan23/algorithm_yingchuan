package com.codechen.niuketop;

import com.codechen.leetcode.utils.TreeNode;

public class NC12 {

    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {

            return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        }

        private TreeNode buildTree(int[] preorder, int preleft, int preright, int[] inorder, int inleft, int inright) {

            if (preleft > preright) {
                return null;
            }

            /*定义一个节点*/
            int rootval = preorder[preleft];
            int rootIndex = 0;
            TreeNode node = new TreeNode(rootval);

            for (int i = 0; i <= inright; i++) {
                if (inorder[i] == rootval) {
                    rootIndex = i;
                    break;
                }
            }

            node.left = buildTree(preorder, preleft + 1, preleft + (rootIndex - inleft), inorder, inleft, rootIndex - 1);
            node.right = buildTree(preorder, preleft + (rootIndex - inleft) + 1, preright, inorder, rootIndex + 1, inright);
            return node;
        }
    }

}
