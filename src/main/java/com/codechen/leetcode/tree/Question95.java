package com.codechen.leetcode.tree;


import java.util.LinkedList;
import java.util.List;


//不同的二叉树
public class Question95 {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<TreeNode> generateTrees(int n) {

        LinkedList<TreeNode> treeNodes = new LinkedList<TreeNode>();
        if (n == 0) {
            return treeNodes;
        }
        return dfs(1, n);
    }

    //深度优先搜索
    private LinkedList<TreeNode> dfs(int f, int end) {
        LinkedList<TreeNode> treeNodes = new LinkedList<>();

        if (f > end) {
            treeNodes.add(null);
            return treeNodes;
        }
        for (int i = f; i <= end; ++i) {
            LinkedList<TreeNode> left = dfs(f, i - 1);
            LinkedList<TreeNode> right = dfs(i + 1, end);


            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    treeNodes.add(root);
                }
            }

        }
        return treeNodes;
    }


}
