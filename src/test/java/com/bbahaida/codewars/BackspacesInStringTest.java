package com.bbahaida.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class BackspacesInStringTest {
    @Test
    public void testCleanString() {
        final BackspacesInString bis = new BackspacesInString();
        assertEquals("ab", bis.cleanString("ab"));
        assertEquals("ac", bis.cleanString("abc#d##c"));
        assertEquals("", bis.cleanString("abc####d##c#"));
        assertEquals("hskjdgd", bis.cleanString("#hskjdgd"));
        assertEquals("", bis.cleanString("##"));
    }
}
