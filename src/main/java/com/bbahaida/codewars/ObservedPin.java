package com.bbahaida.codewars;

import java.util.*;
import java.util.stream.Collectors;

public class ObservedPin {

    static Map<String, List<String>> neighbors = buildDictionary();

    private static Map<String, List<String>> buildDictionary() {
        Map<String, List<String>> dictionary = new HashMap<>();
        dictionary.put("0", Arrays.asList("0", "8"));
        dictionary.put("1", Arrays.asList("1", "2", "4"));
        dictionary.put("2", Arrays.asList("1", "2", "3", "5"));
        dictionary.put("3", Arrays.asList("2", "3", "6"));
        dictionary.put("4", Arrays.asList("1", "4", "5", "7"));
        dictionary.put("5", Arrays.asList("2", "4", "5", "6", "8"));
        dictionary.put("6", Arrays.asList("3", "5", "6", "9"));
        dictionary.put("7", Arrays.asList("4", "7", "8"));
        dictionary.put("8", Arrays.asList("0", "5", "7", "8", "9"));
        dictionary.put("9", Arrays.asList("6", "8", "9"));
        return dictionary;
    }

    public static List<String> getPINs(String observed) {
        return Arrays.stream(observed.split(""))
                .map(digit -> neighbors.get(digit))
                .reduce((a, b)
                        -> Collections.singletonList(b.stream()
                                .reduce((c, d)
                                        -> c.concat(
                                        a.stream()
                                                .map(e -> ""+e + d)
                                                .collect(Collectors.joining(",")
                                                ))).orElse(""))
                ).orElse(new ArrayList<>());
    } // getPINs

}
