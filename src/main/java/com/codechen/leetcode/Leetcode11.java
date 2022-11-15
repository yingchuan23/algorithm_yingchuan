package com.codechen.leetcode;

public class Leetcode11 {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while(left < right){
            res = height[left] < height[right] ? Math.max((right - left) * height[left++],res) : Math.max((right - left) * height[right--] ,res);
        }

        return res;
    }

}
