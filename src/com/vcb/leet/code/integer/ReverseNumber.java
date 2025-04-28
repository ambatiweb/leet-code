package com.vcb.leet.code.integer;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed integer range [-2 power 31, 2 power 31,-1], then return 0.
 * -
 * Min: -2147483648
 * max: 2147483647
 * -
 * Example:
 * Input: x = 123
 * Output: 321
 */
public class ReverseNumber {

    public static void main(String[] args) {

        System.out.println(reverse(123)); // Output: 321
        System.out.println(reverse(-123)); // Output: -321
        System.out.println(reverse(120)); // Output: 21
        System.out.println(reverse(0)); // Output: 0
        System.out.println(reverse(1534236469)); // Output: 0 (overflow)
    }
    public static int reverse(int x) {
        int reversed = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        while (x != 0) {
            // Get the last digit
            int lastDigit = x % 10;

            // Check for overflow
            if (reversed > max / 10 || (reversed == max / 10 && lastDigit > 7)) {
                return 0;
            }
            if (reversed < min / 10 || (reversed == min / 10 && lastDigit < -8)) {
                return 0;
            }
            // Add the last digit to the reversed number
            reversed = reversed * 10 + lastDigit;

            // Remove the last digit from x
            x /= 10;
        }
        return reversed;
    }
}
