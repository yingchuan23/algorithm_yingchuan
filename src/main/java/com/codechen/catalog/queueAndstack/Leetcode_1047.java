package com.codechen.catalog.queueAndstack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Leetcode_1047 {

    public String removeDuplicates(String s) {

        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (deque.isEmpty() || deque.peek() != c) {
                deque.push(c);
            } else {
                deque.pop();
            }
        }

        String str = "";

        while (!deque.isEmpty()) {
            str = deque.pop() + str;
        }
        return str;
    }

}
