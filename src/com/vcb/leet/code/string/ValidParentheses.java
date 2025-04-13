package com.vcb.leet.code.string;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println(isValid(s)); // Output: true
    }

    public static boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
