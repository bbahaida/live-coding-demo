package com.bbahaida.demolivecodingadias;

import java.util.Arrays;

public class StringParser {

    private static final String SEPARATORS_PATTERN = "(,|\n|;|\t)+";
    private static final String COMMA = ",";

    public static int sum(String str) {
        return Arrays.stream(split(str))
                .mapToInt(Integer::valueOf)
                .sum();
    }

    private static String[] split(String str) {
        return str.replaceAll(SEPARATORS_PATTERN, COMMA)
                .split(COMMA);
    }
}
