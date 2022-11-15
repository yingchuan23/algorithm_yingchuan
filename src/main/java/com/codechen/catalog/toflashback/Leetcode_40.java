package com.codechen.catalog.toflashback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leetcode_40 {


    List<List<Integer>> result = new ArrayList<>();
    LinkedList path = new LinkedList<Integer>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        backtracking(candidates, target, 0, 0);
        return result;
    }

    private void backtracking(int[] candidates, int target, int sum, int start) {
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                break;
            }
            //正确剔除重复解的办法
            //跳过同一树层使用过的元素
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            path.add(candidates[i]);
            backtracking(candidates, target, sum + candidates[i], i + 1);
            path.removeLast();
        }
    }
}
