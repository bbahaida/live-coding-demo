package com.bbahaida.demolivecodingadias;

import java.util.Arrays;

public class StringParser {

    private static final String SEPARATORS = "(,|\n|;|\t)+";
    private static final String COMMA = ",";

    public static int sum(String str) {
        return Arrays.stream(str.replaceAll(SEPARATORS, COMMA).split(COMMA))
                .mapToInt(Integer::valueOf)
                .sum();
    }
}
