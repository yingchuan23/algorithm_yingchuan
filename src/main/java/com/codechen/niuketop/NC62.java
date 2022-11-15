package com.codechen.niuketop;

import com.codechen.niuketop.utils.TreeNode;
import org.hamcrest.core.Is;

public class NC62 {

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }

        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right) && Math.abs(helper(root.left) - helper(root.right)) < 2;

    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(helper(root.left), helper(root.right)) + 1;
    }
}
