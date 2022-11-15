package com.codechen.catalog.hash;

public class Leetcode_242 {

    public boolean isAnagram(String s, String t) {

        int[] records = new int[26];
        for (char c : s.toCharArray()) {
            records[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            records[c - 'a'] -= 1;
        }
        for (int record : records) {
            if (record != 0){
                return false;
            }
        }
        return true;
    }

}
