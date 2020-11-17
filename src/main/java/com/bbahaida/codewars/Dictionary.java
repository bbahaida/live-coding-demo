package com.bbahaida.codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dictionary {
    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {
        int index = 0;
        double score = 0;

        for (int i = 0; i < words.length; i++) {
            double tf = tf(words[i], to);
            double idf = idf(words, to);

            double tfIdf = tf * Math.log(words.length / idf);

            if (tfIdf > score) {
                index = i;
                score = tfIdf;
            }
        }
        return score > 0 ? words[index] : null;
    }

    private double idf(String[] words, String to) {
        double n = 0;
        Pattern pattern = Pattern.compile(String.format("[%s]", to));
        for (String word : words) {
            if (pattern.matcher(word).matches()) {
                n++;
                break;
            }
        }
        return Math.log(words.length / n);
    }

    private double tf(String word, String term) {
        Pattern pattern = Pattern.compile(String.format("[%s]", term));
        Matcher matcher = pattern.matcher(word);
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        return (double)matches / word.length();
    }
}
