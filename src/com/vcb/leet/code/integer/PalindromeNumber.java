package com.vcb.leet.code.integer;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // true
        System.out.println(isPalindrome(-121)); // false
        System.out.println(isPalindrome(10)); // false
        System.out.println(isPalindrome(12321)); // true
    }

    public static boolean isPalindrome(int x) {
        // Negative numbers and numbers ending with 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNumber = 0;
        while (x > reversedNumber) {
            // Get the last digit and add it to the reversed number
            reversedNumber = reversedNumber * 10 + x % 10;
            // Remove the last digit from x
            x /= 10;
        }

        // Check if the number is a palindrome
        return x == reversedNumber || x == reversedNumber / 10;
    }
}
