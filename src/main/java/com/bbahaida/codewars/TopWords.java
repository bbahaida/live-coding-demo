package com.bbahaida.codewars;

import java.util.*;
import java.util.stream.Collectors;

public class TopWords {

    public static final String SPECIAL_CHARS_REGEX = "[\n\\s/?_:,;!.-]";

    public static List<String> top3(String s) {
        Map<String, Integer> cache = new HashMap<>();
        List<String> strings = Arrays.asList(s.trim().toLowerCase().split(SPECIAL_CHARS_REGEX));
        strings.parallelStream().forEach(term -> {
            if (eligible(term)) {
                int occ = cache.get(term) != null ? cache.get(term) : 0;
                cache.put(term, ++occ);
            }
        });
        return cache.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    private static boolean eligible(String term) {
        return term != null && !term.equals("") && !term.matches("[^\\w]+");
    }
}

