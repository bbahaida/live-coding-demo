package com.bbahaida.demolivecodingadias;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {

    private static final String SUFFIX = "ay";
    private static final String SPACE_REGEX = "\\s";
    private static final String SPECIAL_CHARACTERS_REGEX = "[\\^$.|?*!+()]";

    public static String pigIt(String str) {
        return Arrays.stream(str.split(SPACE_REGEX))
                .map(word ->  new StringBuffer(word.substring(1)).append(word.charAt(0)))
                .map(word -> {
                    if (!word.toString().matches(SPECIAL_CHARACTERS_REGEX)) {
                        return word.append(SUFFIX);
                    }
                    return word;
                })
                .collect(Collectors.joining(" "));
    }
}
