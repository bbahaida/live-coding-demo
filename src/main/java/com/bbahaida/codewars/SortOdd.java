package com.bbahaida.codewars;

import java.util.PrimitiveIterator.OfInt;
import java.util.stream.IntStream;

public class SortOdd {
    public static int[] sortArray(int[] array) {
        OfInt oddStream = IntStream.of(array).filter(SortOdd::isOdd).sorted().iterator();

        return IntStream.of(array).map(i -> isOdd(i) ? oddStream.next() : i).toArray();
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
