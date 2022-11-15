package com.codechen.leetcode.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: com.codechen.leetcode.tree.Question145
 * @description: TODO
 * @author: CodeJ
 * @create: 2021-07-12 1:54
 */
public class Question145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        preorder(root,res);

        return res;
    }

    private void preorder(TreeNode root, List<Integer> res) {
        if (root == null){
            return;
        }
        preorder(root.left,res);
        preorder(root.right,res);

        res.add(root.val);

    }

}
