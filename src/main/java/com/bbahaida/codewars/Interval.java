package com.bbahaida.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

// https://www.codewars.com/kata/52b7ed099cdc285c300001cd/train/java
public class Interval {
    public static int sumIntervals(int[][] intervals) {

        return intervals == null ? 0 : (int) Arrays.stream(intervals)
                .flatMapToInt(interval -> IntStream.range(interval[0], interval[1]))
                .distinct()
                .count();
    }
}
