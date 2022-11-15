package com.codechen.catalog.queueAndstack;


import java.util.Deque;
import java.util.LinkedList;

/*逆波兰表达式求值*/
public class Leetcode_150 {

    //*逆波兰表达式*/
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (tokens[i].equals("-")) {
                stack.push(-stack.pop() + stack.pop());
            } else if (tokens[i].equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (tokens[i].equals("/")) {
                int temp = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 / temp);
            } else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }

        return stack.pop();
    }

}
