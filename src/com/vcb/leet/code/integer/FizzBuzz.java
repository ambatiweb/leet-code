package com.vcb.leet.code.integer;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.
 * But for multiples of three it should print "Fizz" instead of the number and for the multiples of five print
 * "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".
 */
public class FizzBuzz {
    public static void main(String[] args) {
        int n = 6;
        String[] result = fizzBuzz(n);
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static String[] fizzBuzz(int n) {
        String[] result = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            } else {
                result[i - 1] = String.valueOf(i);
            }
        }
        return result;
    }
}
