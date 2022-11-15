package com.codechen.catalog.queueAndstack;

import java.util.Stack;

/*使用栈生成队列*/
public class Leetcode_232 {

    class MyQueue {

        /*负责进栈*/
        Stack<Integer> stackIn;
        /*负责出栈*/
        Stack<Integer> stackOut;

        public MyQueue() {
            stackIn = new Stack<>();
            stackOut = new Stack<>();
        }


        /*入队列*/
        public void push(int x) {
            stackIn.push(x);
        }

        /*出栈  删除*/
        public int pop() {
            dumpstackIn();
            return stackOut.pop();
        }

        /*不删除  出栈*/
        public int peek() {
            dumpstackIn();
            return stackOut.peek();
        }

        /*空*/
        public boolean empty() {
            return stackOut.isEmpty() && stackIn.isEmpty();
        }

        // 如果stackOut为空，那么将stackIn中的元素全部放到stackOut中
        private void dumpstackIn() {
            if (!stackOut.isEmpty()) {
                return;
            }
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }

        }

    }

}
