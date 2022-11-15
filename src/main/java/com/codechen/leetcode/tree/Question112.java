package com.codechen.leetcode.tree;

/**
 * @program: leetcode_chendeyou
 * @description: 判断路径和是否等于一个数
 * @author: miaocat19
 * @create: 2021-10-26 11:50
 **/
public class Question112 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }

    /**

     *@description

     *@params

     *@return  boolean

     *@author  miaocat19

     *@CreateDate  2021/10/26

     *@modification

     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        if (root.left == null && root.right == null && root.val == targetSum){
            return true;
        }

        return hasPathSum(root.left,targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

}
