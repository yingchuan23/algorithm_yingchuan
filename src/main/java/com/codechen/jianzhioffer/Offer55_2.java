package com.codechen.jianzhioffer;

import com.codechen.niuketop.utils.TreeNode;

/*是不是平衡二叉树*/
public class Offer55_2 {


    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(helper(root.left) - helper(root.right)) <= 1;
    }


    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(helper(root.left),helper(root.right)) + 1;
    }

}
