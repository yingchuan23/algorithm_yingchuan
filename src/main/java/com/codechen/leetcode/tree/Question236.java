package com.codechen.leetcode.tree;

import com.codechen.leetcode.utils.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @className: com.codechen.leetcode.tree.Question236
 * @description: 236. 二叉树的最近公共祖先
 * @author: CodeJ
 * @create: 2021-07-12 10:53
 */
public class Question236 {

    Map<Integer, TreeNode> parent = new HashMap<>();
    Set<Integer>  visted = new HashSet<>();



    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);
        while (p != null){
            visted.add(p.val);
            p = parent.get(p.val);
        }
        while(q != null){
            if (visted.contains(q.val)){
                return q;
            }
            q = parent.get(q.val);
        }
        return null;
    }

    private void dfs(TreeNode root) {
        if (root.left != null){
            parent.put(root.left.val,root);
            dfs(root.left);
        }

        if (root.right != null){
            parent.put(root.right.val,root);
            dfs(root.right);
        }

    }


}
