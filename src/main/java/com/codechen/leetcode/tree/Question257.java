package com.codechen.leetcode.tree;

import com.codechen.leetcode.utils.TreeNode;


import java.util.ArrayList;
import java.util.List;

/**
 * @className: com.codechen.leetcode.tree.Question257
 * @description: 二叉树的所有路径
 * @author: CodeJ
 * @create: 2021-07-13 0:38
 */
public class Question257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        ConstructorPath(root, "", paths);
        return paths;
    }

    private void ConstructorPath(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            StringBuffer pathSB = new StringBuffer(path);
            pathSB.append(Integer.toString(root.val));
            if (root.left == null && root.right == null) {
                paths.add(pathSB.toString());
            } else {
                pathSB.append("->");
                ConstructorPath(root.left, pathSB.toString(), paths);
                ConstructorPath(root.right, pathSB.toString(), paths);

            }
        }
    }
}
