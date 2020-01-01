package com.bbahaida.demolivecodingadias;

import java.util.List;

public class SmileFaces {

    private static final String SMILE_REGEX = "[:;][-~]?[)D]";

    public static int countSmileys(List<String> arr) {
        // Just Smile :)
        return (int) arr.stream().filter(s -> s.matches(SMILE_REGEX)).count();
    }
}
