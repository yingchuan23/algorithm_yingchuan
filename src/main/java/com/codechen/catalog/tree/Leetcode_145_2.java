package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Leetcode_145_2 {


    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode pop = stack.pop();
            list.add(pop.val);
            if (pop.left != null){
                stack.add(pop.left);
            }

            if (pop.right != null){
                stack.add(pop.right);
            }
        }

        Collections.reverse(list);

        return list;
    }
}
