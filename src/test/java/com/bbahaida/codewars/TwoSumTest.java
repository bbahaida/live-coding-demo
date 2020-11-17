package com.bbahaida.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {
    @Test
    public void basicTests()
    {
        doTest(new int[]{1,2,3},          new int[]{0,2});
        doTest(new int[]{1234,5678,9012}, new int[]{1,2});
        doTest(new int[]{2,2,3},          new int[]{0,1});
    }
    private void doTest(int[] numbers, int[] expected)
    {
        int target = numbers[expected[0]] + numbers[expected[1]];
        int[] actual = TwoSum.twoSum(numbers, target);
        assertNotNull("Received a null", actual);
        assertEquals("Received an array that's not of length 2", 2, actual.length);
        int received = numbers[actual[0]] + numbers[actual[1]];
        assertEquals(target, received);
    }
}
