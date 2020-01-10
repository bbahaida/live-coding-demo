package com.bbahaida.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProdFibTest {
    @Test
    public void test1() {
        long[] r = new long[] {55, 89, 1};
        assertArrayEquals(r, ProdFib.productFib(4895));
    }
    @Test
    public void test2() {
        long[] r = new long[] {89, 144, 0};
        assertArrayEquals(r, ProdFib.productFib(5895));
    }

    @Test
    public void test3() {
        long[] r = new long[] {1346269, 2178309, 1};
        assertArrayEquals(r, ProdFib.productFib(2932589879121L));
    }
    @Test
    public void test4() {
        long[] r = new long[] {1836311903L, 2971215073L, 0};
        assertArrayEquals(r, ProdFib.productFib(4456077604922913920L));
    }

}