package com.bbahaida.hackerrank;

public class PowerSum {

    public static int powerSum(int x, int n) {
        if (x == 0) return 0;

        for (int i = 1; i <= (x/2)+1; i++ ) {
            powerSum(i, n);
        }

        return 0;
    }
}
