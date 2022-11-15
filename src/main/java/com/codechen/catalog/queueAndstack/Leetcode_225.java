package com.codechen.catalog.queueAndstack;




import java.util.ArrayDeque;
import java.util.Deque;

/*用队列实现栈*/
public class Leetcode_225 {


    class MyStack {

        Deque<Integer> deque;

        public MyStack() {
            deque = new ArrayDeque();
        }

        public void push(int x) {
            deque.addLast(x);
        }

        public int pop() {
            int size = deque.size();
            size--;

            while (size-- > 0) {
                deque.addLast(deque.pollFirst());
            }

            return deque.pollFirst();
            /*return deque.pollLast();*/
        }

        public int top() {
            return deque.peekLast();
        }


        public boolean empty() {
            return deque.isEmpty();
        }
    }


}
