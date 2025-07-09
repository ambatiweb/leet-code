package com.vcb.leet.algos;

/*
    Evaluate the value of an arithmetic expression in Reverse Polish Notation.
    Valid operators are +, -, *, /. Each operand may be an integer or
    another expression
    Example: ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
             ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */

import java.util.Stack;

public class PolishNotation {
    public static void main(String[] args) {
        String[] tokens = new String[] { "2", "1", "+", "3", "*" };
        System.out.println(evalRPN(tokens));
    }

    private static int evalRPN(String[] tokens) {
        int returnVal = 0;

        String operators = "+-*/";

        Stack<String> stack = new Stack<>();

        for (String t: tokens){
            if (!operators.contains(t)){
                stack.push(t);
            } else {
                // pop the numbers from the stack if it is an operator
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                switch (t) {
                    case "+":
                        stack.push(String.valueOf(a+b));
                        break;
                    case "-":
                        stack.push(String.valueOf(b - a));
                        break;
                    case "*":
                        stack.push(String.valueOf(a * b));
                        break;
                    case "/":
                        stack.push(String.valueOf(b / a));
                        break;
                }
            }
        }
        returnVal = Integer.parseInt(stack.pop());
        return returnVal;
    }
}
