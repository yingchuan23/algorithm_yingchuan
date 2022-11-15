package com.codechen.leetcode.tree;


import java.util.ArrayList;
import java.util.List;


//二叉树层序遍历
public class Question102 {


    //二叉树
    private class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }
    }

    ArrayList<List<Integer>> levels = new ArrayList<List<Integer>>();

    //层序遍历
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return levels;
        }
        helper(root, 0);
        return levels;
    }


    private void helper(TreeNode root, int level) {
            if (levels.size() == level){
                levels.add(new ArrayList<Integer>());
            }

        levels.get(level).add(root.val);

            if (root.left != null){

                    helper(root.left,level+1);

            }
            if (root.right != null){
                    helper(root.right,level+1);
            }
    }
}
