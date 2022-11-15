package com.codechen.catalog.toflashback;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode_491 {

    private LinkedList<Integer> path = new LinkedList<>();
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums, 0);
        return res;
    }

    private void backtracking(int[] nums, int start) {

        if (path.size() > 1) {
            res.add(new ArrayList<>(path));
        }
        int[] used = new int[201];

        for (int i = start; i < nums.length; i++) {
            if ((!path.isEmpty() && nums[i] < path.get(path.size() - 1)) || used[nums[i] + 100] == 1) {
                continue;
            }
            used[nums[i] + 100] = 1;
            path.add(nums[i]);
            backtracking(nums, i + 1);
            path.removeLast();
        }
    }

}
