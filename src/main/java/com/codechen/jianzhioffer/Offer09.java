package com.codechen.jianzhioffer;

import java.util.Stack;

/*使用两个栈实现队列*/
public class Offer09 {


    class CQueue {

        Stack stack1 = null;
        Stack stack2 = null;

        public CQueue() {
            stack1 = new Stack();
            stack2 = new Stack();
        }

        public void appendTail(int value) {
            stack1.add(value);
        }

        public int deleteHead() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.add(stack1.pop());
                }
            }
            if (stack2.isEmpty()) {
                return -1;
            } else {
                return (int) stack2.pop();
            }

        }

    }

}
