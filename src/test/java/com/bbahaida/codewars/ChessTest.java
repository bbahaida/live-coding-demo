package com.bbahaida.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChessTest {
    @Test
    public void sampleTests() {
        assertEquals("Test for (a1, c1)", 2, Chess.knight("a1", "c1"));
        assertEquals("Test for (a1, f1)", 3, Chess.knight("a1", "f1"));
        assertEquals("Test for (a1, f3)", 3, Chess.knight("a1", "f3"));
        assertEquals("Test for (a1, f4)", 4, Chess.knight("a1", "f4"));
        assertEquals("Test for (a1, f7)", 5, Chess.knight("a1", "f7"));
    }
}