package com.codechen.leetcode.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 二叉树的中序遍历
 * @author: CodeJ
 * @create: 2021-06-07 23:39
 **/

public class Question94 {



    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;


        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }







    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> integers = new ArrayList<>();
        inorder(root,integers);

        return integers;
    }


    public void inorder(TreeNode root, ArrayList<Integer> integers) {
        if (root ==null){
            return;
        }
        inorder(root.left,integers);
        integers.add(root.val);
        inorder(root.right,integers);
    }


}
