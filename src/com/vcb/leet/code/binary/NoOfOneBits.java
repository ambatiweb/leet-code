package com.vcb.leet.code.binary;

public class NoOfOneBits {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(hammingWeight(n));
    }

    private static int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int mask = 1 << i;
            if ((n & mask) != 0) {
                count++;
            }
        }
        return count;
    }
} // TC: O(1), SC: O(1)
