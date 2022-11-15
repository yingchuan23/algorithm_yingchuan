package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode_637 {


    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> que = new LinkedList<>();

        que.add(root);

        while (!que.isEmpty()) {


            int size = que.size();

            double sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = que.poll();
                sum += node.val;
                TreeNode left = node.left, right = node.right;
                if (left != null) {
                    que.offer(left);
                }
                if (right != null) {
                    que.offer(right);
                }
            }
            res.add(sum / size);

        }

        return res;
    }



}
