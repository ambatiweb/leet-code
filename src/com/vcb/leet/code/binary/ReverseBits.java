package com.vcb.leet.code.binary;

public class ReverseBits {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(reverseBits(n));
    }
    // you need treat n as an unsigned value
    private static int reverseBits(int n) {
        int reverse = 0;
        for (int i = 1; i <= 32; i++) {
            reverse = reverse << 1;
            reverse = reverse | (1 & n);
            n = n >> 1;
        }
        return reverse;
    }
} // TC: O(1), SC: O(1)
