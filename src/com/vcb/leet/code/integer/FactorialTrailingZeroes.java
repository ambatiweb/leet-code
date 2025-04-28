package com.vcb.leet.code.integer;

/**
 * Factorial Trailing Zeroes
 * * Given an integer n, return the number of trailing zeroes in n!.
 * A trailing zero is created by the factors 10 = 2 * 5.
 * Time complexity: O(log5(n)), Space complexity: O(1)
 *  n/5+n/25+n/125+n/625+...
 * Example:
 * Input: n = 5
 * Output: 1
 */
public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(5)); // Output: 1
        System.out.println(trailingZeroes(10)); // Output: 2
        System.out.println(trailingZeroes(25)); // Output: 6
        System.out.println(trailingZeroes(100)); // Output: 24
    }

    public static int trailingZeroes(int n) {
        int count = 0;
        // Count the number of factors of 5 in n!
        while (n > 0) {
            // Each factor of 5 contributes to a trailing zero
            n /= 5;
            // Add the number of factors of 5 to the count
            count += n;
        }
        return count;
    }
}
