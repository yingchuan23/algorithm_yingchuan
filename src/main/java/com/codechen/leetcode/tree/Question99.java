package com.codechen.leetcode.tree;


import java.util.ArrayList;

//99. 恢复二叉搜索树
public class Question99 {


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



    //恢复二叉树
    public void recoverTree(TreeNode root) {

        ArrayList<TreeNode> lists = new ArrayList<>();
        dfs(root, lists);
        TreeNode a = null;
        TreeNode b = null;


        //先把两个错误的数遍历出来
        for (int i = 0; i < lists.size() - 1 ; ++i) {
            if (lists.get(i).val >lists.get(i+1).val){
                b = lists.get(i+1);
                if (a == null){
                    a = lists.get(i);
                }
            }
        }
        if (a != null && b != null){
            int tmp = a.val;
            a.val = b.val;
            b.val = tmp;
        }

    }

    /*dfs中序便利*/
    private void dfs(TreeNode root, ArrayList<TreeNode> lists) {
        if (root == null){
            return;
        }
        dfs(root.left,lists);
        lists.add(root);
        dfs(root.right,lists);
    }
}
