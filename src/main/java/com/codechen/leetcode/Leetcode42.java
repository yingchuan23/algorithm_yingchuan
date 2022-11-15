package com.codechen.leetcode;

public class Leetcode42 {

    public int trap(int[] height) {
        int res = 0;
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        rightmax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        for (int i = 1; i < height.length; i++) {
            res += Math.min(rightmax[i], leftmax[i]) - height[i];
        }

        return res;

    }

    public int trap1(int[] height) {
        int res = 0;

        for (int i = 1; i < height.length - 1; i++) {
            int maxleft = 0;
            int maxright = 0;
            for (int j = i; j >= 0; j--) {
                maxleft = Math.max(maxleft, height[j]);
            }
            for (int j = i; j < height.length; j++) {
                maxright = Math.max(maxright, height[j]);
            }
            res += Math.min(maxright, maxleft) - height[i];

        }
        return res;
    }

}
