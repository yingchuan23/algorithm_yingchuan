package com.codechen.niuketop;


import com.codechen.niuketop.utils.TreeNode;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NC136 {


    public int[] solve(int[] xianxu, int[] zhongxu) {
        // write code here
        TreeNode root = buildertree(xianxu, 0, xianxu.length - 1, zhongxu, 0, zhongxu.length - 1);
        int[] result = helper(root);

        return result;
    }

    private int[] helper(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        ArrayList<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (size == 1) {
                    list.add(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                size--;
            }

        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private TreeNode buildertree(int[] preorder, int preleft, int preright, int[] inorder, int inleft, int inright) {
        if (preleft > preright) {
            return null;
        }
        int rootval = preorder[preleft];
        TreeNode root = new TreeNode(rootval);
        int rootIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootval) {
                rootIndex = i;
                break;
            }
        }

        root.left = buildertree(preorder, preleft + 1, preleft + (rootIndex - inleft), inorder, inleft, rootIndex - 1);
        root.right = buildertree(preorder, preleft + (rootIndex - inleft) + 1, preright, inorder, rootIndex + 1, inright);

        return root;
    }
}
