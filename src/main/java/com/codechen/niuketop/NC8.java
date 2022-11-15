package com.codechen.niuketop;

import com.codechen.niuketop.utils.TreeNode;

import java.util.*;

public class NC8 {

    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

    Stack<Integer> stack = new Stack<Integer>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int expectNumber) {
        dfs(root, expectNumber);
        return list;
    }

    private void dfs(TreeNode root, int expectNumber) {
        if (root == null) {
            return;
        }
        expectNumber = expectNumber - root.val;
        stack.add(root.val);
        if (root.left == null && root.right == null && expectNumber == 0) {
            list.add(new ArrayList<>());
        }
        dfs(root.left, expectNumber);
        dfs(root.right, expectNumber);
        stack.pop();

    }


}
