package com.codechen.leetcode.tree;

import com.codechen.leetcode.utils.TreeNode;
import jdk.nashorn.internal.ir.CallNode;

import static java.lang.Integer.MIN_VALUE;

/**
 * @description: 验证是不是二叉排序树
 * @author: CodeJ
 * @create: 2021-07-28 16:52
 **/
public class Question98 {


    static long haha =  MIN_VALUE;

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(0);
        boolean validBST = isValidBST(treeNode);
        System.out.println(validBST);

    }

    public static boolean isValidBST(TreeNode root) {

        if (root == null) {
            return true;
        }
        if (isValidBST(root.left) == false) {
            return false;
        }
        if (root.val <= haha){
            return false;
        }
        
        haha = root.val;
        return isValidBST(root.right);

    }

}
