package com.codechen.niuketop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class NC121 {

    ArrayList<String> result = new ArrayList<String>();
    HashSet<String> set = new HashSet<String>();

    StringBuilder sb = new StringBuilder();
    boolean[] used;

    public ArrayList<String> Permutation(String str) {
        if (str == null || str.length() == 0) {
            return result;
        }

        used = new boolean[str.length()];
        helper(str);
        for (String s : set) {
            result.add(s);
        }
        return result;
    }

    private void helper(String str) {
        if (sb.length() == str.length()) {
            set.add(new String(sb).toString());
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            sb.append(str.charAt(i));
            helper(str);
            sb.deleteCharAt(sb.length() - 1);
            used[i] = false;
        }

    }



   /* List<List<Integer>> result = new ArrayList<>();// 存放符合条件结果的集合
    LinkedList<Integer> path = new LinkedList<>();// 用来存放符合条件结果
    boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) {
            return result;
        }
        used = new boolean[nums.length];
        permuteHelper(nums);
        return result;
    }

    private void permuteHelper(int[] nums) {
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
            permuteHelper(nums);
            path.removeLast();
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        NC121 nc121 = new NC121();
        nc121.permute(ints);
    }*/
}
