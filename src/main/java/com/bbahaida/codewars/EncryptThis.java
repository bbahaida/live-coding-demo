package com.bbahaida.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EncryptThis {
    public static String encryptThis(String text) {
        if ("".equals(text)){
            return "";
        }
        return Arrays.stream(text.split("\\s"))
                .map(EncryptThis::encrypt)
                .collect(Collectors.joining(" "));
    }

    private static String encrypt(String word) {
        return (int)word.charAt(0) + word.substring(1).replaceAll("(.)(.*)(.)$", "$3$2$1");
    }

}
