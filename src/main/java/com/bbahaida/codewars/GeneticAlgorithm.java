package com.bbahaida.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeneticAlgorithm {
    /***************************************************************
     * Feel free to change the private methods' signatures (I did) *
     * Only the "run" functions are tested                         *
     ***************************************************************/
    protected String generate(int length) {
        // TODO: Implement the generate method
        return IntStream.range(0, length).mapToObj(this::randomBit).collect(Collectors.joining());
    }

    private String randomBit(int i) {
        return ((int)(Math.random() * 100)) % 2 == 0 ? "0" : "1";
    }

    protected List<String> initialPopulation(int size){
        return new ArrayList<>();
    }


    private String[] select(List<String> population, List<Double> fitnesses) {
        // TODO: Implement the select method
        return null;
    }

    private String mutate(String chromosome, double p) {
        // TODO: Implement the mutate method
        return null;
    }

    private String[] crossover(String chromosome1, String chromosome2) {
        // TODO: Implement the crossover method
        return null;
    }

    public String run(ToDoubleFunction<String> fitness, int length, double p_c, double p_m) {
        // TODO: Implement the run method
        return null;
    }

    public String run(ToDoubleFunction<String> fitness, int length, double p_c, double p_m, int iterations) {
        // TODO: Implement the run method
        return null;
    }
}
