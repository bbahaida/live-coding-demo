package com.bbahaida.codewars;

import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class BackWardsPrime {
    public static String backwardsPrime(long start, long end) {
        return LongStream.range(start, end + 1)
                .filter(BackWardsPrime::isBackWards)
                .mapToObj(Long::toString)
                .collect(Collectors.joining(" "));
    }

    private static boolean isBackWards(long l) {
        String string = new StringBuilder(l + "").reverse().toString();
        long rev = Long.parseLong(string);
        if (string.length() < 2 || rev == l) {
            return false;
        }
        return isPrime(l) && isPrime(rev);
    }
    private static boolean isPrime(long num) {
        return BigInteger.valueOf(num).isProbablePrime((int)Math.log(num));
    }
}
