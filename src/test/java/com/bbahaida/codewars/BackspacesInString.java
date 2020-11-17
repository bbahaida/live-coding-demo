package com.bbahaida.codewars;

import java.util.Arrays;

public class BackspacesInString {
    public String cleanString(String s) {
        if (isBackspaceSymbol(s)) {
            return "";
        }
        return Arrays.stream(s.split(""))
                .reduce((previous, next) -> {
                    if (isBackspaceSymbol(previous) && !isBackspaceSymbol(next)) {
                        return next;
                    } else if (isBackspaceSymbol(next)) {
                        return (previous.length() > 0 ? previous.substring(0, previous.length() - 1) : "");
                    }
                    return previous + next;
                })
                .orElse("");
    }

    private boolean isBackspaceSymbol(String previous) {
        return "#".equals(previous);
    }
}
