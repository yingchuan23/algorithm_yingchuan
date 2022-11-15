package com.codechen.catalog.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.*;

public class Leetcode_107 {

    List<List<Integer>> res = new ArrayList<>();


    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        //使用dfs
        checkFun02(root);

        Collections.reverse(res);

        return res;
    }

    private void checkFun02(TreeNode node) {

        if (node == null) {
            return;
        }

        Queue<TreeNode> que = new LinkedList<>();

        que.offer(node);


        while(!que.isEmpty()){

            ArrayList<Integer> itemlist = new ArrayList<>();

            int size = que.size();

            while(size > 0){

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
