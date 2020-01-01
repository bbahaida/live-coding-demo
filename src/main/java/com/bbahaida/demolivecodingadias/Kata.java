package com.bbahaida.demolivecodingadias;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata {
    public static String expandedForm(int num)
    {

        String numAsString = num + "";

        return IntStream.range(0, numAsString.length())
                .map(index -> expendElement(index, numAsString))
                .filter(Kata::positiveNumber)
                .mapToObj(Kata::asString)
                .collect(Collectors.joining(" + "));
    }

    private static int expendElement(int index, String numAsString) {
        int value = Integer.valueOf(numAsString.charAt(index)+"");
        return value > 0 ? expend(value, numAsString.length()- index - 1) : 0;
    }

    private static int expend(int value, int position) {
        return (int) (value*Math.pow(10, position));
    }

    private static boolean positiveNumber(int i) {
        return i > 0;
    }

    private static String asString(int i) {
        return i+"";
    }
}
