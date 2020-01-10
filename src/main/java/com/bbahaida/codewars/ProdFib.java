package com.bbahaida.codewars;

public class ProdFib {
    public static long[] productFib(long prod) {
        long low = 1;
        long high = 2;
        while ( low * high < prod) {
            long tmp = low;
            low = high;
            high = high + tmp;
        }
        return new long[]{low, high, (low * high) == prod ? 1 : 0};
    }
}
