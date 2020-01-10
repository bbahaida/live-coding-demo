package com.bbahaida.codewars;

public class PigLatin {
    private static final String PIG_REGEX = "(\\w)(\\w*)";
    private static final String REPLACE_REGEX = "$2$1ay";

    public static String pigIt(String str) {
        return str.replaceAll(PIG_REGEX, REPLACE_REGEX);
    }
}
