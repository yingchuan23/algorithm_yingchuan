package com.codechen.jianzhioffer;

import java.util.PriorityQueue;

public class Offer41 {

    class MedianFinder {

        PriorityQueue<Integer> queuemax = null;
        PriorityQueue<Integer> queuemin = null;

        public MedianFinder() {
            queuemax = new PriorityQueue<>((a, b) -> (b - a));
            queuemin = new PriorityQueue<>((a, b) -> (a - b));
        }

        public void addNum(int num) {
            int sizemax = queuemax.size();
            int sizemin = queuemin.size();

            if (sizemax == sizemin) {
                if (queuemin.isEmpty() || queuemin.peek() >= num) {
                    queuemax.add(num);
                } else {
                    queuemax.add(queuemin.poll());
                    queuemin.add(num);
                }


            } else {
                if (queuemax.peek() <= num) {
                    queuemin.add(num);
                } else {
                    queuemin.add(queuemax.poll());
                    queuemax.add(num);
                }
            }

        }

        public double findMedian() {
            int sizemax = queuemax.size();
            int sizemin = queuemin.size();
            if (sizemax == sizemin) {
                return (queuemin.peek() + queuemax.peek()) / 2.0;
            } else {
                return queuemax.peek();
            }
        }
    }


}
