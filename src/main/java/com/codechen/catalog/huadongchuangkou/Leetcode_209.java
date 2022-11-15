package com.codechen.catalog.huadongchuangkou;

import java.util.HashMap;

/**
 * The type Leetcode 209.
 *
 * @program: leetcode_chendeyou
 * @description:
 * @author: miaocat19
 * @create: 2021 -12-17 20:43
 */
public class Leetcode_209 {

        /**
         * Min sub array len int.
         *
         * @param target the target
         * @param nums   the nums
         * @return the int
         */
        public int minSubArrayLen(int target, int[] nums) {

                HashMap hashMap = new HashMap();

                int result = Integer.MAX_VALUE;
                /*滑动窗口的起点*/
                int i = 0;
                /*滑动窗口的之和*/
                int sum = 0;
                /*滑动窗的的长度*/
                int intlength = 0;
                for (int j = 0; j < nums.length; j++) {

                        sum += nums[j];
                        while (sum >= target) {
                                intlength = j - i + 1;
                                result = result < intlength ? result : intlength;
                                sum -= nums[i++];
                        }
                }

                return result == Integer.MAX_VALUE ? 0 : result;

        }

}

