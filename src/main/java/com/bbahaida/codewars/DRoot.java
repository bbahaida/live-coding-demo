package com.bbahaida.codewars;

public class DRoot {
    public static int digital_root(int n) {
        int sum = 0;

        while(n > 0) {

            int r = n % 10;
            n = n / 10;
            sum += r;

            if (n==0 && sum /10 > 0) {
                n = sum;
                sum = 0;
            }
        }

        return sum;
    }
}
