package com.bbahaida.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class NthDayTest {
    @Test
    public void basicTest() {
        assertEquals("January, 15", NthDay.getDay(15, false));
        assertEquals("February, 10", NthDay.getDay(41, false));
        assertEquals("February, 28", NthDay.getDay(59, false));
        assertEquals("March, 1", NthDay.getDay(60, false));
        assertEquals("February, 29", NthDay.getDay(60, true));
        assertEquals("December, 31", NthDay.getDay(365, false));
        assertEquals("December, 31", NthDay.getDay(366, true));
    }

}
