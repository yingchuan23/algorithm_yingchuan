package com.codechen.niuketop;

import com.codechen.niuketop.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/*判断是不是二叉搜索的树*/
public class NC60 {

    public boolean[] judgeIt(TreeNode root) {
        // write code here
        //
        if (root == null) {
            return new boolean[]{true, true};
        }

        boolean[] booleans = new boolean[2];

        booleans[0] = isSerachTreeBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        booleans[1] = isBalanced(root);

        return booleans;
    }

    /*判断是不是完全二叉树*/
    private boolean isBalanced(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        /*是不是最后一个空节点*/
        boolean flag = false;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                flag = true;
                continue;
            }
            if (flag) {
                return false;
            }
            queue.add(node.left);
            queue.add(node.right);
        }
        return true;
    }

    /*判断是不是二叉搜索树*/
    private boolean isSerachTreeBST(TreeNode root, int minValue, int maxValue) {
        if (root == null) {
            return true;
        }
        if (root.val <= minValue || root.val >= maxValue) {
            return false;
        }

        return isSerachTreeBST(root.left, minValue, root.val) && isSerachTreeBST(root.right, root.val, maxValue);
    }


}
