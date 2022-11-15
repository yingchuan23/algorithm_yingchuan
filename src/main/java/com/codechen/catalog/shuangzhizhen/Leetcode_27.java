package com.codechen.catalog.shuangzhizhen;

public class Leetcode_27 {


    public int removeElement(int[] nums, int val) {

        int fastindex = 0;
        int slowindex = 0;
        for (slowindex = 0; fastindex < nums.length; fastindex++) {

            if (nums[fastindex] != val){
                nums[slowindex++] = nums[fastindex];
            }
        }
        return slowindex;
    }

}
