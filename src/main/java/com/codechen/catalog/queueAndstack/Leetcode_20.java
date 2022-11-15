package com.codechen.catalog.queueAndstack;

import java.util.Deque;
import java.util.LinkedList;

public class Leetcode_20 {

    public boolean isValid(String s) {


        Deque<Character> deque = new LinkedList<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '('){
                deque.push(')');
            }else if (c == '{'){
                deque.push('}');
            }else if (c == '['){
                deque.push(']');
                /*第二个条件代表一种情况       （}       */
            }else if (deque.isEmpty() || deque.peek() != c){
                return false;
            }else{
                deque.pop();
            }

        }
        return deque.isEmpty();
    }

}
