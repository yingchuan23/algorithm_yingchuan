package com.codechen.catalog.tree;


import com.codechen.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/*没啥区别  又写了一遍而已*/
public class Leetcode_144_2 {


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            list.add(pop.val);
            if (pop.right != null) {
                stack.add(pop.right);
            }

            if (pop.left != null) {
                stack.add(pop.left);
            }
        }
        return list;
    }


}
