package com.codechen.leetcode.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: com.codechen.leetcode.tree.Question144
 * @description: 二叉树的前序遍历
 * @author: CodeJ
 * @create: 2021-07-12 1:44
 */
public class Question144 {


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res  = new ArrayList<>();
        preorder(root, res);


        return res;
    }

    private void preorder(TreeNode root, List<Integer> res) {
        if (root == null){
            return;
        }
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);

    }


}
