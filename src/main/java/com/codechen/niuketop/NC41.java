package com.codechen.niuketop;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


/*这个和 leetcode的第三题 差不多*/
public class NC41 {

    public int maxLength(int[] arr) {
        //用链表实现队列，队列是先进先出的
        Queue<Integer> queue = new LinkedList<>();

        int max = 0;
        for (int i : arr) {
            while (queue.contains(i)) {
                queue.poll();
            }
            queue.offer(i);
            max = Math.max(queue.size(), max);
        }

        return max;
    }

    public static int maxLength2(int[] arr) {
        if (arr.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0, j = 0; i < arr.length; ++i) {
            if (map.containsKey(arr[i])) {
                /*为什么要max   因为重复的元素可能不止一个   要是两个都重复的时候
                * 好比我们看一下这个 [3,3,2,1,3,3,3,1]
                    1  3  都有重复的数字
                * */
                j = Math.max(j, map.get(arr[i]) + 1);
            }
            map.put(arr[i], i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    /*public static void main(String[] args) {
        int[] ints = {3, 3, 2, 1, 3, 3, 3, 1};

        System.out.println(maxLength2(ints));

    }*/

    public int maxLength3(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        /*双指针*/
        for (int left = 0, right = 0; right <= arr.length - 1; right++) {
            if (map.containsKey(arr[right])) {
                left = Math.max(left, map.get(arr[right]) + 1);
            }
            map.put(arr[right], right);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }


    /*leetcode3*/
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        int max = 0;

        for (int left = 0, right = 0; right < s.length(); right++) {

            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }

            map.put(s.charAt(right), right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }


}
