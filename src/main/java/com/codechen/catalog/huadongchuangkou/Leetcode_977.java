package com.codechen.catalog.huadongchuangkou;

import java.util.HashMap;

/**
 * The type Leetcode 977.
 */
public class Leetcode_977 {


    /**
     * Total fruit int.
     *
     * @param fruits the fruits
     * @return the int
     */
    public int totalFruit(int[] fruits) {

        int ans = 0, i = 0;
        Counter count = new Counter();
        for (int j = 0; j < fruits.length; ++j) {
            count.add(fruits[j], 1);
            while (count.size() >= 3) {
                count.add(fruits[i], -1);
                if (count.get(fruits[i]) == 0) {
                    count.remove(fruits[i]);
                }
                i++;
            }

            ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }

    /**
     * The type Counter.
     */
    class Counter extends HashMap<Integer, Integer> {

        /**
         * Get int.
         *
         * @param k the k
         * @return the int
         */
        public int get(int k) {
            return containsKey(k) ? super.get(k) : 0;
        }

        /**
         * Add.
         *
         * @param k the k
         * @param v the v
         */
        public void add(int k, int v) {
            put(k, get(k) + v);
        }
    }
}
