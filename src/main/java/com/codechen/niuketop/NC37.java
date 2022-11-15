package com.codechen.niuketop;

import com.codechen.niuketop.utils.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NC37 {

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals, (v1, v2) -> v1.start - v2.start);
        ArrayList<Interval> res = new ArrayList<Interval>();

        int idx = -1;

        for (Interval interval : intervals) {
            if (idx == -1 || interval.start > res.get(idx).end) {
                res.add(interval);
                idx++;
            } else {
                res.get(idx).end = Math.max(interval.end, res.get(idx).end);
            }
        }
        return res;

    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        int idx = -1;

        int[][] res = new int[intervals.length][2];
        for (int[] interval : intervals) {
            if (idx == -1 || interval[0] > res[idx][1]) {
                res[++idx] = interval;
            } else {
                res[idx][1] = Math.max(res[idx][1], interval[1]);
            }
        }
        return Arrays.copyOf(res, idx + 1);
    }


}

