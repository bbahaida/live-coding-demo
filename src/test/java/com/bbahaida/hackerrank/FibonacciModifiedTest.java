package com.bbahaida.hackerrank;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class FibonacciModifiedTest {

    @Test
    public void fibonacciModified_should_return_27() {
        Assertions.assertThat(FibonacciModified.fibonacciModified(0, 1, 5)).isEqualTo(5);
    }
    @Test
    public void fibonacciModified_should_return_x() {
        Assertions.assertThat(FibonacciModified.fibonacciModified(0, 1, 10)).isGreaterThan(27);
    }

}
