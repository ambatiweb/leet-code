package com.vcb.leet.code.binary;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        int  n = 5;
        System.out.println(Arrays.toString(countBits(n)));
    }

    private static int[] countBits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        int offset = 1;
        for (int i = 1; i <= n; i++) {
            if (offset * 2 == i) { // if current number "i" is power of 2
                offset = i;
            }
            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }
}// TC: O(n), SC: O(n)
