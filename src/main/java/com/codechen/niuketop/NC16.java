package com.codechen.niuketop;

import com.codechen.niuketop.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class NC16 {

    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot.left);
        queue.add(pRoot.right);
        while (!queue.isEmpty()) {
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();
            if (node1 == null && node2 == null){
                continue;
            }
            if (node1 == null || node2 == null || node1.val != node2.val) {
                return false;
            }
            queue.add(node1.left);
            queue.add(node2.right);
            queue.add(node1.right);
            queue.add(node2.left);
        }
        return true;
    }
}
