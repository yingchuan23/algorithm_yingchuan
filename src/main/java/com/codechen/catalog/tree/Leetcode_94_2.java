package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.*;

public class Leetcode_94_2 {


    /*好理解的写法 官方题解*/
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        return list;
    }

}
