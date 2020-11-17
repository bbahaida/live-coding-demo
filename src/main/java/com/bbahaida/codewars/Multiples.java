package com.bbahaida.codewars;

import java.util.stream.IntStream;

public class Multiples {
    public int solution(int number) {
        return IntStream.range(1, number)
                .filter(n -> n%3==0 || n%5==0).sum();
    }
}
