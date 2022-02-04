package com.bbahaida.interviews;

import java.util.*;
import java.util.stream.Collectors;

public class Amazon {

    public static int[] uniqueNumbers(int[] array) {
        Map<Integer, Integer> numberFrequency = new HashMap<>();
        for (int el : array) {
            numberFrequency.put(el, numberFrequency.getOrDefault(el, 0) + 1);
        }
        return numberFrequency.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static Map<String, Integer> kyePhrase(String text, List<String> execluded) {
        Map<String, Integer> result = new HashMap<>();
        Arrays.stream(text.split(" "))
                .map(String::strip)
                .map(String::toLowerCase)
                .forEach(word -> {
                    if (!execluded.contains(word)) {
                        result.put(word, result.getOrDefault(word, 0) + 1);
                    }
                });
        return result;
    }

    public static char firstNonRepeating(String str) {
        char result = '_';
        Map<Character, Integer> frequency = new HashMap<>();
        String[] chars = str.split("");
        for (String s : chars) {
            frequency.put(s.charAt(0), frequency.getOrDefault(s.charAt(0), 0) + 1);
        }
        for (String s : chars) {
            if (frequency.get(s.charAt(0)) == 1) {
                result = s.charAt(0);
                break;
            }
        }

        return result;
    }

    public static int missingNumber(int[] input) {
        List<Integer> asList = Arrays.stream(input).boxed().collect(Collectors.toList());
        int max = asList.stream().mapToInt(i -> i).max().getAsInt();
        for (int i = 1; i <= max; i++) {
            if (!asList.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static String runLengthEncoding(String input) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>();
        for (String c : input.split("")) {
            Map.Entry<String, Integer> entry;
            if (entries.isEmpty() || !entries.get(entries.size() - 1).getKey().equals(c)) {
                entry = new AbstractMap.SimpleEntry<>(c, 1);
                entries.add(entry);
            } else {
                entry = entries.get(entries.size() - 1);
                entry.setValue(entry.getValue() + 1);
            }

        }
        return entries.stream()
                .map(e -> e.getValue() + e.getKey())
                .collect(Collectors.joining());
    }

    public static String runLengthDecoding(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i += 2) {
            int code = Integer.parseInt(String.valueOf(input.charAt(i)), 10);
            String c = String.valueOf(input.charAt(i + 1));
            sb.append(c.repeat(code));
        }

        return sb.toString();
    }

    public static int[][] ratInMaze(int[][] maze) {
        int[][] solution = new int[maze.length][maze.length];
        solveMaze(maze, 0, 0, solution);
        return solution;
    }

    private static boolean solveMaze(int[][] maze, int row, int col, int[][] solution)
    {
        if (row == maze.length - 1 && col == maze.length - 1
                && maze[row][col] == 1) {
            solution[row][col] = 1;
            return true;
        }

        if (isSafe(maze, row, col)) {
            if (solution[row][col] == 1)
                return false;

            solution[row][col] = 1;

            // check down
            if (solveMaze(maze, row + 1, col, solution))
                return true;
            // check right
            if (solveMaze(maze, row, col + 1, solution))
                return true;

            // check up
            if (solveMaze(maze, row - 1, col, solution))
                return true;

            // check left
            if (solveMaze(maze, row, col - 1, solution))
                return true;

            // BACKTRACK
            solution[row][col] = 0;
            return false;
        }

        return false;
    }

    private static boolean isSafe(
            int[][] maze, int raw, int col) {
        int length = maze.length;
        return (raw >= 0 && raw < length && col >= 0
                && col < length && maze[raw][col] == 1);
    }


    public static boolean validAnagram(String s1, String s2) {

        if (s1.equals(s2)) return true;
        if (s1.length() != s2.length()) return false;

        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        int index = sb2.indexOf(sb1.substring(0, 1));
        if (index < 0) return false;
        return validAnagram(sb1.substring(1), sb2.replace(index, index+1, "").toString());
    }
    public static boolean validParenthesis(String input) {
        Stack<String> stack = new Stack<>();
        for (String c: input.split("")) {
            if (c.equals("(")) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static String generateParenthesis(int n) {


        StringBuilder builder = new StringBuilder();
        generateParenthesis(2*n, 0, "",  builder);
        return builder.toString();
    }

    private static void generateParenthesis(int n, int diff, String comb, StringBuilder builder) {
        if (diff < 0 || diff > n) return;
        else if (n == 0) {
            if (diff == 0) {
                builder.append(comb);
            }
        } else {
            generateParenthesis(n - 1, diff + 1, "(", builder);
            generateParenthesis(n - 1, diff - 1, ")", builder);
        }
    }

    public static double median(int[] arr1, int[] arr2) {
        return median(Subarray.fromArray(arr1), Subarray.fromArray(arr2));
    }

    private static double median(Subarray arr1, Subarray arr2) {
        if (arr1.getSize() == 1) return (arr1.getFirst() + arr2.getFirst()) / 2.;
        if (arr1.getSize() == 2) {
            // [3, 3]
            // [0, 4]
            return (Math.max(arr1.getFirst(), arr2.getFirst()) + Math.min(arr1.getLast(), arr2.getLast())) / 2.;
        }
        double median1 = arr1.getMedian();
        double median2 = arr2.getMedian();
        if (median1 == median2) return median1;
        if (median1 > median2) {
            return median(arr1.subarray(0, arr1.getSize() / 2 + 1 ),
                    arr2.subarray((arr2.getSize() - 1) / 2, arr2.getSize()));
        }
        return median(arr1.subarray((arr1.getSize() - 1) / 2, arr1.getSize()),
                arr2.subarray(0, arr2.getSize() / 2 + 1 ));
    }



    private static class Subarray {
        private int[] underlying;
        private int start;
        private int size;

        private static Subarray fromArray(int[] arr) {
            Subarray subarray = new Subarray();
            subarray.underlying = arr;
            subarray.start = 0;
            subarray.size = arr.length;
            return subarray;
        }

        private Subarray subarray(int start, int size) {
            Subarray subarray = new Subarray();
            subarray.underlying = underlying;
            subarray.start = this.start + start;
            subarray.size = size - 1;
            return subarray;
        }

        private int getSize() {
            return size;
        }

        private int getFirst(){
            return atIndex(start);
        }

        private int getLast(){
            return atIndex(start + size - 1);
        }
        private int atIndex(int index) {
            return underlying[index];
        }
        private boolean isEven() {
            return size % 2 == 0;
        }
        public double getMedian() {
            if (isEven()) {
                return (atIndex(start + size / 2 - 1) + atIndex(start + size / 2)) / 2.;
            }
            return atIndex(start + size / 2);
        }
    }
}



