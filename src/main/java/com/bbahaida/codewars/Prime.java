package com.bbahaida.codewars;

import java.math.BigInteger;
import java.util.function.Function;

public class Prime {
    public static boolean isPrime(int num) {
        //return firstAttempt(num);
        return BigInteger.valueOf(num).isProbablePrime((int)Math.log(num));
    }

    private static boolean firstAttempt(int num) {
        if (num < 2 || num == 4) {
            return false;
        }

        if (num == 3) {
            return true;
        }
        Function<Integer, BigInteger> memoize = Memoizer.memoize(Prime::computeFactorial);
        BigInteger fact = memoize.apply(num - 1);
        BigInteger value = BigInteger.valueOf(num);
        return fact.mod(value).longValueExact() == num -1 || fact.mod(value).longValueExact() == -1;
    }

    private static BigInteger computeFactorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= num; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}


