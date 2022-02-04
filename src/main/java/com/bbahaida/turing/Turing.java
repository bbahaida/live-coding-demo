package com.bbahaida.turing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Turing {
    public static int count(int[] arr) {

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int res = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.contains(arr[i] + 1)) {
                res++;
            }
        }

        return res;
    }

    public static boolean valid(String s) {
        if (s.length() % 2 != 0) return false;
        String replaced = s.replaceAll("[()]", "")
                .replaceAll("[^{}]", "");
        return replaced.length() % 2 == 0;
    }
}
