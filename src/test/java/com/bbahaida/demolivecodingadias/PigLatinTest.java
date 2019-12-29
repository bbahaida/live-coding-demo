package com.bbahaida.demolivecodingadias;

import org.junit.Test;

import static org.junit.Assert.*;

public class PigLatinTest {

    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
        assertEquals("oratay oay oresmay !", PigLatin.pigIt("tora o mores !"));
    }

}