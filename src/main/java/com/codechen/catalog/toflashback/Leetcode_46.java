package com.codechen.catalog.toflashback;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode_46 {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) {
            return result;
        }
        used = new boolean[nums.length];
        backtracking(nums);

        return result;
    }

    private void backtracking(int[] nums) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            path.add(nums[i]);
            backtracking(nums);
            path.removeLast();
            used[i] = false;
        }

    }

}
