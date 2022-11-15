package com.codechen.catalog.hash;

public class Leetcode_383 {


    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }

        int[] records = new int[26];
        for (char c : magazine.toCharArray()) {
            records[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            records[c - 'a']--;
            if (records[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
