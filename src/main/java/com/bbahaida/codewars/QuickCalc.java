package com.bbahaida.codewars;

import java.math.BigInteger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class QuickCalc {
    public static BigInteger choose(int n, int p) {

        Function<Integer, BigInteger> memoize = Memoizer.memoize(QuickCalc::computeFactorial);
        BigInteger nFactorial = memoize.apply(n);
        BigInteger pFactorial = memoize.apply(p);
        BigInteger npFactorial = memoize.apply(n-p);
        return nFactorial.divide(pFactorial.multiply(npFactorial));
    }

    private static BigInteger computeFactorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= num; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

}

