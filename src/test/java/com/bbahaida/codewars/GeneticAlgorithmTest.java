package com.bbahaida.codewars;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneticAlgorithmTest {

    GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm();
    @Test
    public void generate_ShouldReturnStringOfLength() {
        assertEquals(8, geneticAlgorithm.generate(8).length());
    }
    @Test
    public void generate_ResultShouldContainsOnlyBits() {
        Assertions.assertThat(geneticAlgorithm.generate(8)).containsPattern("^[01]+$");
    }
    @Test
    public void initialPopulation() {
        Assertions.assertThat(geneticAlgorithm.initialPopulation(8));
    }

}
