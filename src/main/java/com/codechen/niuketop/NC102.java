package com.codechen.niuketop;

import com.codechen.leetcode.utils.TreeNode;

import java.util.*;

public class NC102 {


    public int lowestCommonAncestor(TreeNode root, int o1, int o2) {
        // write code here
        return helper(root, o1, o2).val;
    }

    private TreeNode helper(TreeNode root, int o1, int o2) {
        if (root == null || root.val == o1 || root.val == o2) {
            return root;
        }
        TreeNode left = helper(root.left, o1, o2);
        TreeNode right = helper(root.right, o1, o2);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }


    /*非递归解法*/
    public int lowestCommonAncestor2(TreeNode root, int o1, int o2) {
        Map<Integer, Integer> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();

        map.put(root.val, Integer.MAX_VALUE);
        queue.offer(root);
        while (!map.containsKey(o1) || !map.containsKey(o2)) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                map.put(node.left.val, node.val);
                queue.offer(node.left);
            }
            if (node.right != null) {
                map.put(node.right.val, node.val);
                queue.offer(node.right);
            }
        }

        HashSet<Integer> set = new HashSet<>();

        while (map.containsKey(o1)) {
            set.add(o1);
            o1 = map.get(o1);
        }

        while (!set.contains(o2)) {
            o2 = map.get(o2);
        }

        return o2;
    }

}
