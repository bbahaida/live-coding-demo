package com.bbahaida.interviews;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class AmazonTest {
    @Test
    public void uniqueNumbers_should_return_unique() {
        int[] data = new int[]{1, 3, 5, 5, 6, 6, 7, 8, 9, 10, 10};

        int[] expected = new int[]{1, 3, 7, 8, 9};

        int[] actual = Amazon.uniqueNumbers(data);

        Assertions.assertThat(actual).containsExactly(expected);
    }

    @Test
    public void keyPhrase_should_return_most_used_words() {
        String text = "To sorry world an at do spoil along. Incommode he depending do frankness remainder to. Edward day almost active him friend thirty piqued. People as period twenty my extent as. Set was better abroad ham plenty secure had horses. Admiration has sir decisively excellence say everything inhabiting acceptance. Sooner settle add put you sudden him.";
        List<String> excluded = List.of("to", "an", "at", ".", "as", "my");

        Map<String, Integer> result = Amazon.kyePhrase(text, excluded);

        Assertions.assertThat(result).containsEntry("do", 2);

    }

    @Test
    public void keyPhrase_should_return_most_used_wordsNY() {
        String text = "People in England will be allowed to end their quarantines if they can produce negative tests on days six and seven. That creates a more lenient policy than in the United States, where people can end their isolation periods 10 days after showing symptoms if they have not had a fever for 24 hours and if their other Covid-19 symptoms are improving.";
        List<String> excluded = List.of("in", "to", "if", "on", "and", ".", "a", "the", "not", ",");

        Map<String, Integer> result = Amazon.kyePhrase(text, excluded);

        Assertions.assertThat(result).containsEntry("people", 2);

    }

    @Test
    public void firstNonRepeating_should_return_b() {
        String text = "aaabcccdeef";

        char result = Amazon.firstNonRepeating(text);

        Assertions.assertThat(result).isEqualTo('b');
    }

    @Test
    public void missingNumber_should_return_6() {
        int[] input = {3, 7, 1, 2, 8, 4, 5};

        int result = Amazon.missingNumber(input);

        Assertions.assertThat(result).isEqualTo(6);
    }

    @Test
    public void runLengthEncoding_should_return_4a2b3c2a() {
        String input = "aaaabbcccaa";

        String result = Amazon.runLengthEncoding(input);

        Assertions.assertThat(result).isEqualTo("4a2b3c2a");
    }

    @Test
    public void runLengthDecoding_should_return_aaaabbcccaa() {
        String input = "4a2b3c2a";

        String result = Amazon.runLengthDecoding(input);

        Assertions.assertThat(result).isEqualTo("aaaabbcccaa");
    }

    @Test
    public void ratInMaze_should_find_a_solution() {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}};
        int[][] expected = {
                {1, 0, 0, 0},
                {1, 1, 0, 0},
                {0, 1, 0, 0},
                {0, 1, 1, 1}};

        int[][] result = Amazon.ratInMaze(maze);

        Assertions.assertThat(result).isEqualTo(expected);
    }
    /*@Test
    public void ratInMaze_should_find_a_solution2() {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 0}};
        int[][] expected = {
                {1, 0, 0, 0},
                {1, 1, 0, 0},
                {0, 1, 1, 1},
                {0, 1, 1, 0}};

        int[][] result = Amazon.ratInMaze(maze);

        Assertions.assertThat(result).isEqualTo(expected);
    }*/
    @Test
    public void ratInMaze_should_not_find_a_solution() {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 0, 0, 0},
                {1, 1, 1, 1}};
        int[][] expected = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};

        int[][] result = Amazon.ratInMaze(maze);

        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void validAnagram_should_return_true() {
        String s1 = "danger";
        String s2 = "garden";

        Assertions.assertThat(Amazon.validAnagram(s1, s2)).isTrue();
    }
    @Test
    public void validAnagram_should_return_false() {
        String s1 = "danger";
        String s2 = "gardnn";

        Assertions.assertThat(Amazon.validAnagram(s1, s2)).isFalse();
    }
    @Test
    public void validParenthesis_should_return_true() {
        Assertions.assertThat(Amazon.validParenthesis("(())()")).isTrue();
    }
    @Test
    public void validParenthesis_should_return_false() {
        Assertions.assertThat(Amazon.validParenthesis("((())()")).isFalse();
    }
    @Test
    public void generateParenthesis_should_return_valid() {
        Assertions.assertThat(Amazon.generateParenthesis(3)).isNotEmpty();
    }
    @Test
    public void median_should_return_2_5() {
        int [] arr1 = {1,3,5};
        int [] arr2 = {2,4,6};
        Assertions.assertThat(Amazon.median(arr1, arr2)).isCloseTo(3.5, Offset.offset(0.000001));
    }

}
