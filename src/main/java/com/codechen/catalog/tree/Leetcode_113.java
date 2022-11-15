package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.*;


/*dfs*/

public class Leetcode_113 {

    List<List<Integer>> path = new ArrayList<>();

    Stack<Integer> stack = new Stack<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return path;
    }

    private void dfs(TreeNode root, int targetSum) {
        if (root == null) {
            return;
        }
        stack.push(root.val);
        targetSum -= root.val;
        if (root.left == null && root.right == null && targetSum == 0) {
            path.add(new ArrayList<Integer>(stack));
        }
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
        stack.pop();
    }
}
