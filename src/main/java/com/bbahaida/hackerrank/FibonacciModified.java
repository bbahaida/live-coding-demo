package com.bbahaida.hackerrank;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciModified {
    public static int fibonacciModified(int t1, int t2, int n) {
        return withMemo(t1, t2, n, new HashMap<>()).intValue();
    }

    private static BigInteger withMemo(int t1, int t2, int n, Map<Integer, BigInteger> memo) {
        if (memo.containsKey(n)) return memo.get(n);
        if (n < 1) return BigInteger.ZERO;
        if (n < 3) return BigInteger.ONE;
        memo.put(n, withMemo(t1 - 1, t1, n - 2, memo).add(withMemo(t1, t2, n - 1, memo).pow(2)));
        return memo.get(n);
    }
}
