package com.bbahaida.codewars;

import org.junit.Test;

import static org.junit.Assert.*;
public class UserCRSTest {

    @Test
    public void testProgressSameLevel() {
        User user = new User();
        user.rank = -7;
        user.incProgress(-7);
        assertEquals(3, user.progress);
    }
    @Test
    public void testProgressAbove1() {
        User user = new User();
        user.rank = -7;
        user.incProgress(-8);
        assertEquals(1, user.progress);
    }
    @Test
    public void testProgressAbove2() {
        User user = new User();
        user.rank = -5;
        user.incProgress(-7);
        assertEquals(0, user.progress);
    }
    @Test
    public void testProgressBy1() {
        User user = new User();
        user.incProgress(-7);
        assertEquals(10, user.progress);
    }
    @Test
    public void testProgressBy2() {
        User user = new User();
        user.incProgress(-6);
        assertEquals(40, user.progress);
    }
    @Test
    public void testProgressBy2_() {
        User user = new User();
        user.rank = -6;
        user.progress = 20;
        user.incProgress(-4);
        assertEquals(60, user.progress);
    }
    @Test
    public void testProgressBy3() {
        User user = new User();
        user.incProgress(-5);
        assertEquals(90, user.progress);
    }
    @Test
    public void testProgressBy4() {
        User user = new User();
        user.incProgress(-4);
        assertEquals(60, user.progress);
    }
    @Test
    public void testProgressBy4_() {
        User user = new User();
        user.rank = -1;
        user.incProgress(4);
        assertEquals(60, user.progress);
    }
    @Test
    public void testRankedBy1() {
        User user = new User();
        user.incProgress(-4);
        assertEquals(60, user.progress);
        assertEquals(-7, user.rank);
    }
    @Test
    public void testRankedBy2() {
        User user = new User();
        user.progress = 80;
        user.rank = -1;
        user.incProgress(4);
        assertEquals(40, user.progress);
        assertEquals(2, user.rank);
    }
    @Test
    public void testRankedBy1_to_8() {
        User user = new User();
        user.progress = 90;
        user.rank = 7;
        user.incProgress(8);
        assertEquals(0, user.progress);
        assertEquals(8, user.rank);
    }
}
