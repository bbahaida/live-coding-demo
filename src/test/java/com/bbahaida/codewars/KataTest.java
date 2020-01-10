package com.bbahaida.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {

    @Test
    public void testSomething() {
        assertEquals("10 + 2", Kata.expandedForm(12));
        assertEquals("40 + 2", Kata.expandedForm(42));
        assertEquals("70000 + 300 + 4", Kata.expandedForm(70304));
    }

}