package com.bbahaida.codewars;

import java.util.Arrays;

//https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java
public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(a -> Arrays.stream(array2).anyMatch(b -> b.contains(a)))
                .distinct()
                .toArray(String[]::new);
    }
}
