package com.bbahaida.demolivecodingadias;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Order {
    public static String order(String words) {

        if (words.length() == 0) return "";
        return Arrays.stream(words.split("\\s"))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .collect(Collectors.joining(" "));
    }
}
