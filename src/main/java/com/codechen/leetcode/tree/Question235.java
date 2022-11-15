package com.codechen.leetcode.tree;

import com.codechen.leetcode.utils.TreeNode;

/**
 * @className: com.codechen.leetcode.tree.Question235
 * @description: 235. 二叉搜索树的最近公共祖先
 * @author: CodeJ
 * @create: 2021-07-12 10:34
 */
public class Question235 {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode ancestor = root;

        while(true){
            if (p.val < ancestor.val && q.val < ancestor.val){
                ancestor = ancestor.left;
            } else if (p.val > ancestor.val && q.val > ancestor.val) {
                ancestor = ancestor.right;
            }else{
                break;
            }
        }
        return ancestor;
    }



}
