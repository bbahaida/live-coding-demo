package com.bbahaida.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class DictionaryTest {
    @Test
    public void testBerries() {
        Dictionary dictionary = new Dictionary(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});
        assertEquals("strawberry", dictionary.findMostSimilar("strawbery"));
        assertEquals("cherry", dictionary.findMostSimilar("berry"));
    }

    @Test
    public void testLanguages() {
        Dictionary dictionary = new Dictionary(new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});
        assertEquals("java", dictionary.findMostSimilar("heaven"));
        assertEquals("javascript", dictionary.findMostSimilar("javascirpt"));
    }
    @Test
    public void testOthers() {
        Dictionary dictionary = new Dictionary(new String[]{"codewars", "zqdrhpviqslik", "pdyjrkaylryr", "wars"});
        assertEquals("codewars", dictionary.findMostSimilar("coddwars"));
        assertEquals("zqdrhpviqslik", dictionary.findMostSimilar("rkacypviuburk"));
    }

}