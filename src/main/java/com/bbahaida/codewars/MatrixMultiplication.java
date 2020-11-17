package com.bbahaida.codewars;

public class MatrixMultiplication {
    public static int[][] matrixMultiplication(int[][] a, int[][] b) {

        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int res = 0;
                for (int k = 0; k < a.length; k++) {
                     res += a[i][k] * b[k][j];
                }
                result[i][j] = res;
            }
        }
        return result;
    }
}
