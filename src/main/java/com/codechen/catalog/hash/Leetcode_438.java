package com.codechen.catalog.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_438 {

    public List<Integer> findAnagrams(String s, String p) {
        int Slength = s.length();
        int Plength = p.length();
        if (Slength < Plength) {
            return new ArrayList();
        }
        ArrayList<Integer> res = new ArrayList<>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(sCount,pCount)){
            res.add(0);
        }

        for (int i = 0; i < (Slength - Plength); i++) {
            sCount[s.charAt(i) - 'a']--;
            sCount[s.charAt(i + Plength) - 'a']++;

            if (Arrays.equals(sCount,pCount)){
                res.add(i + 1);
            }
        }

        return res;
    }
}
