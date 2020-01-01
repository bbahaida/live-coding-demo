package com.bbahaida.demolivecodingadias;

import java.util.Stack;

public class Line {

    private static final int TWENTY_FIVE_BILL = 25;
    private static final int FIFTY_BILL = 50;
    private static final int HUNDRED_BILL = 100;

    public static String Tickets(int[] peopleInLine) {
        Stack<Integer> twentyFiveStack = new Stack<>();
        Stack<Integer> fiftyStack = new Stack<>();
        for (int bill : peopleInLine) {
            if (bill == TWENTY_FIVE_BILL) {
                twentyFiveStack.push(bill);
            } else if (bill == FIFTY_BILL && hasChange(twentyFiveStack)) {
                fiftyStack.push(bill);
                twentyFiveStack.pop();
            } else if (bill == HUNDRED_BILL && hasChange(twentyFiveStack, fiftyStack)) {
                if (hasChange(fiftyStack)){
                    fiftyStack.pop();
                }
                else {
                    twentyFiveStack.pop();
                    twentyFiveStack.pop();
                }
                twentyFiveStack.pop();
            } else {
                return "NO";
            }
        }
        return "YES";
    }

    private static boolean hasChange(Stack<Integer> stack) {
        return !stack.empty();
    }
    private static boolean hasChange(Stack<Integer> twentyFiveStack, Stack<Integer> fiftyStack) {
        return !twentyFiveStack.empty() && (!fiftyStack.empty() || twentyFiveStack.size() >= 3);
    }
}
