package com.bbahaida.codewars;

import java.util.*;

public class Chess {
    private static Map<String, List<String>> board = boardInit();

    private static Map<String, List<String>> boardInit() {
        Map<String, List<String>> board = new LinkedHashMap<>();
        List<String> chars = List.of("a", "b", "c", "d", "e", "f", "g", "h");

        for (String ch: chars) {
            for (int i = 1; i < 9 ; i++) {
                board.put(ch+i, findKnightMoves(ch, i, chars));
            }
        }
        return board;
    }

    private static List<String> findKnightMoves(String ch, int i, List<String> chars) {

        List<String> moves = new ArrayList<>();
        int index = chars.indexOf(ch);
        if (index == 0 || index == 7) {

        }
        if (index > 1 && index < 6) {
            List<String> forward = chars.subList(index + 1, index + 3);
            List<String> backward = chars.subList(index - 2, index);
            if (i > 2 && i < 7) {
                moves.add(forward.get(0)+(i+2));
                moves.add(forward.get(0)+(i-2));
                moves.add(forward.get(1)+(i+1));
                moves.add(forward.get(1)+(i-1));
                moves.add(backward.get(0)+(i+2));
                moves.add(backward.get(0)+(i-2));
                moves.add(backward.get(1)+(i+1));
                moves.add(backward.get(1)+(i-1));
            }
        }
        return moves;
    }

    public static int knight(String start, String  finish) {
        // Your code here!
        return -1;
    }
}
