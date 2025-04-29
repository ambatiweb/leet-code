package com.vcb.leet.code.integer;

/**
 * Nth Root of a Number
 * Given an integer n and a positive integer x, find the nth root of x.
 * The result should be rounded to the nearest integer.
 * Example:
 * Input: n = 3, x = 27
 * Output: 3
 */
public class NthRootOfaNumber {
    public static void main(String[] args) {
        System.out.println(nthRoot(3, 27)); // Output: 3
        System.out.println(nthRoot(2, 16)); // Output: 4
        System.out.println(nthRoot(5, 32)); // Output: 2
        System.out.println(nthRoot(4, 81)); // Output: 3
    }

    public static int nthRoot(int n, int x) {
        // Handle the case when x is 0
        int low = 1;
        int high = x;

        // Use binary search to find the nth root
        while (low <= high) {
            // Calculate the mid-point
            int mid = low + (high - low) / 2;
            // Calculate mid^n
            int power = (int) Math.pow(mid, n);

            // Check if mid^n is equal to x
            if (power == x) {
                return mid;
            } else if (power < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high; // Return the largest integer less than or equal to the nth root
    }
}
