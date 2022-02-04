package com.bbahaida.katas;

public class ComputePi {
    public static double computePi(int n) {

        int pointInCircle = 0;

        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            double distance = (x * x) + (y * y);
            if (distance <= 1) {
                pointInCircle+=1;
            }
        }
        return 4 * pointInCircle / (double) n;
    }
}
