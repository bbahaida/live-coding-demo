package com.bbahaida.codewars;

import java.util.Arrays;

public class ToCamelCase {
    static String toCamelCase(String s) {
        String[] strings = s.split("[-_]");
        return Arrays.stream(strings, 1, strings.length)
                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                .reduce(strings[0], String::concat);
    }
}
