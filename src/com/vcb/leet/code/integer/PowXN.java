package com.vcb.leet.code.integer;

/**
 * Pow(x,n)
 * Implement pow(x,n), which calculates x raised to the power n (i.e. x Power n)
 * Example:
 * x = 2.1 and n = 3
 * x power n means 2.1 power 3 = 9.261
 */
public class PowXN {
    public static void main(String[] args) {
        System.out.println(myPow(2.1, 3)); // Output: 9.261
        System.out.println(myPow(2, -2)); // Output: 0.25
        System.out.println(myPow(0, 5)); // Output: 0.0
        System.out.println(myPow(5, 0)); // Output: 1.0
        System.out.println(myPow(-2, 3)); // Output: -8.0
    }

    public static double myPow(double x, int n) {
        // Handle the case when n is 0
        if (n == 0) return 1;
        // Handle the case when x is 0
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        // Use the fast exponentiation method
        double result = 1;
        // Loop until n becomes 0
        while (n > 0) {
            if ((n & 1) == 1) result *= x; // If n is odd, multiply by x
            x *= x; // Square x
            n >>= 1; // Divide n by 2
        }
        return result;
    }
}
