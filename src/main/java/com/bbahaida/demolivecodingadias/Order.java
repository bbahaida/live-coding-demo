package com.bbahaida.demolivecodingadias;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Order {
    public static String order(String words) {

        if (words.length() == 0) return "";
        return Arrays.stream(words.split("\\s"))
                .sorted(Order::orderByNumericPattern)
                .collect(Collectors.joining(" "));
    }

    private static int orderByNumericPattern(String word1, String word2) {
        Pattern pattern = Pattern.compile("(\\d+)");
        Matcher matcher1 = pattern.matcher(word1);
        Matcher matcher2 = pattern.matcher(word2);
        if (matcher1.find() && matcher2.find()) {
            return Integer.valueOf(matcher1.group(1)).compareTo(Integer.valueOf(matcher2.group(1)));
        }
        throw new RuntimeException("No matching exception");
    }
}
