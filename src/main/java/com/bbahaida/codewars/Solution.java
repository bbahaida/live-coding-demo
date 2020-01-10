package com.bbahaida.codewars;

import java.util.stream.IntStream;

public class Solution {
    public int solution(int number) {
        return IntStream.range(0, number)
                .filter(this::multipleOfThreeOrFive)
                .sum();
    }

    private boolean multipleOfThreeOrFive(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
