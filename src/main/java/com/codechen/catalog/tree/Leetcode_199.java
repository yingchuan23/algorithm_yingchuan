package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode_199 {

    public List<Integer> rightSideView(TreeNode root) {


        ArrayList<Integer> itemlist = new ArrayList<>();
        if (root == null) {
            return itemlist;
        }

        Queue<TreeNode> que = new LinkedList<>();

        que.offer(root);


        while (!que.isEmpty()) {


            int size = que.size();

            while (size > 0) {

                TreeNode tmpNode = que.poll();

                /*从右侧看，这个就是 这样   还剩一个的时候才添加进 list*/
                if (size == 1) {
                    itemlist.add(tmpNode.val);
                }

                if (tmpNode.left != null) {
                    que.offer(tmpNode.left);
                }

                if (tmpNode.right != null) {
                    que.offer(tmpNode.right);
                }
                size--;

            }

        }

        return itemlist;
    }


}
