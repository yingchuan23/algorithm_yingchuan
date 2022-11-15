package com.codechen.catalog.toflashback;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode_216_2 {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(n, k, 1, 0);
        return result;
    }

    private void backTracking(int target, int k, int start, int sum) {
        if (sum > target) {
            return;
        }
        if (path.size() == k) {
            if (sum == target) {
                result.add(new ArrayList<>(path));
            }
            return;
        }
        // 减枝 9 - (k - path.size()) + 1
        for (int i = start; i <= 9 - (k - path.size()) + 1; i++) {
            path.add(i);
            sum += i;
            backTracking(target, k, i + 1, sum);
            //回溯
            path.removeLast();
            //回溯
            sum -= i;
        }
    }

}
