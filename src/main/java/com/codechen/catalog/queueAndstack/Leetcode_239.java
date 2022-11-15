package com.codechen.catalog.queueAndstack;

import java.util.ArrayDeque;

public class Leetcode_239 {

    public int[] maxSlidingWindow(int[] nums, int k) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int index = 0;
        int n = nums.length;

        int[] res = new int[n - k + 1];


        for (int i = 0; i < n; i++) {

            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                /*弹出的对头*/
                deque.poll();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                /*弹出队尾  队尾的数值是最大的*/
                deque.pollLast();
            }

            /*添加对位的额数字*/
            deque.offer(i);

            if (i - k + 1 >= 0) {
                res[index] = nums[deque.peek()];
                index++;
            }
        }

        return res;
    }
}
