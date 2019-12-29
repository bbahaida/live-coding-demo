package com.bbahaida.demolivecodingadias;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringParserTest {

    @Test
    public void test1() {
        String str = "1,2,3,4,5";
        assertEquals(15, StringParser.sum(str));
    }
    @Test
    public void test2() {
        String str = "4\n66\n5\n37\n1";
        assertEquals(113, StringParser.sum(str));

    }
    @Test
    public void test3() {
        String str = "2;81;29;4;9\n";
        assertEquals(125, StringParser.sum(str));

    }
    @Test
    public void test4() {
        String str = "23;,8;\n1,\n;3;7";
        assertEquals(42, StringParser.sum(str));

    }
    @Test
    public void test5() {
        String str = "73;,4;\n2\n\n;30;\t3";
        assertEquals(112, StringParser.sum(str));

    }

}