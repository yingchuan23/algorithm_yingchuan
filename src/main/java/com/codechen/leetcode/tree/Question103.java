package com.codechen.leetcode.tree;

import sun.security.krb5.internal.TGSRep;

import javax.swing.text.TabExpander;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Question103 {


    private class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode() {
        }
    }


    ArrayList<List<Integer>> levels = new ArrayList<>();

    //二叉树的z型曾寻便利
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return levels;
        }
        helper(root, 0);
        return levels;
    }

    private void helper(TreeNode root, int level) {
        if (levels.size() == level) {
            levels.add(new ArrayList<Integer>());
        }

        levels.get(level).add(root.val);

        if ( root.left != null) {
            helper(root.left, level + 1);
        }

        if (root.right != null) {
            helper(root.right, level + 1);
        }





    }

}
