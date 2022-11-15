package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode_257 {


    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        if (root == null) {
            return paths;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<String> pathQueue = new LinkedList<>();
        queue.add(root);
        pathQueue.offer(Integer.toString(root.val));
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            String path = pathQueue.poll();
            if (node.left == null && node.right == null) {
                paths.add(path);
            }else{
                if (node.left != null){
                    queue.offer(node.left);
                    pathQueue.offer(new StringBuffer(path).append("->").append(node.left.val).toString());
                }
                if (node.right != null){
                    queue.offer(node.right);
                    pathQueue.offer(new StringBuffer(path).append("->").append(node.right.val).toString());
                }

            }

        }
        return paths;

    }


}
