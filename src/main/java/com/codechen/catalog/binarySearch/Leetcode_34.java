package com.codechen.catalog.binarySearch;

/**
 * @program: leetcode_chendeyou
 * @description: leetcode34
 * @author: miaocat19
 * <p>
 * //主要分为三种情况给
 * //第一种 target 在数组范围的右边或者左边， 应该返回[-1,-1]
 * //第二种 target 在这个数组里面  但是这个target是不存在的
 * // 第三种 这个数字是纯在的 就是在这个数组里面
 * @create: 2021-12-15 16:31
 **/
public class Leetcode_34 {


    public int[] searchRange(int[] nums, int target) {

        int leftBorder = getLeftBorder(nums, target);
        int rightBorder = getRightBorder(nums, target);

        /*情况一*/
        if (leftBorder == -2 || rightBorder == -2) {
            return new int[]{-1, -1};
        }
        /*这个地方就是请情况三 */
        if (rightBorder - leftBorder > 1) {
            return new int[]{leftBorder + 1, rightBorder - 1};
        }
        /*情况二  虽然在数组的范围内，但是没有这个数*/
        return new int[]{-1, -1};


    }


    //寻找左边的区间边界   这里的边界就是比target的所在的数 左边就是笑一个数字  右边的就是打一个数字
    private int getRightBorder(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int rightBorder = -2;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
                rightBorder = left;
            }
        }

        return rightBorder;
    }

    //寻找右边的区间
    private int getLeftBorder(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int leftBorder = -2; // 记录一下leftBorder没有被赋值的情况
        while (left <= right) {
            int middle = left + ((right - left) / 2);
            if (nums[middle] >= target) { // 寻找左边界，nums[middle] == target的时候更新right
                right = middle - 1;
                leftBorder = right;
            } else {
                left = middle + 1;
            }
        }

        return leftBorder;
    }

    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4};
        int target = 3;
        Leetcode_34 leetcode_34 = new Leetcode_34();
        int[] ints1 = leetcode_34.searchRange(ints, target);
        System.out.println(ints1);

    }

}
