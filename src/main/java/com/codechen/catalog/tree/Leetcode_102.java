package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*二叉树的层序遍历*/
public class Leetcode_102 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {

        /*bfs模式*/
        checkFun02(root);

        return res;
    }

    /*bfs模式*/
    private void checkFun02(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(root);

        while (!que.isEmpty()) {

            ArrayList<Integer> itemlist = new ArrayList<>();

            int size = que.size();

            while (size > 0) {
                TreeNode tmpNode = que.poll();
                itemlist.add(tmpNode.val);

                if (tmpNode.left != null) {
                    que.offer(tmpNode.left);
                }
                if (tmpNode.right !=null){
                    que.offer(tmpNode.right);
                }
                size--;
            }
            res.add(itemlist);
        }
    }

}










