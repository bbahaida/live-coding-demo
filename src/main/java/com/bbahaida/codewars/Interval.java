package com.bbahaida.codewars;

import java.util.Arrays;

public class Interval {
    public static int sumIntervals(int[][] intervals) {

        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        // TODO: implement this method
        if (hasOverlap(intervals)) {
            intervals = handleOverlap(intervals);
        }
        return Arrays.stream(intervals).mapToInt(array -> array[1] - array[0]).sum();
    }

    private static int[][] handleOverlap(int[][] intervals) {
        return null;
    }

    private static boolean hasOverlap(int[][] intervals) {
        return false;
    }
}
