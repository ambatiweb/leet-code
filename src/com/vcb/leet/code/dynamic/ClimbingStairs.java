package com.vcb.leet.code.dynamic;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 4;

        System.out.println(climbStairs(n));
    }

    private static int climbStairs(int n) {
        if(n <= 2) return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }//TC:O(n) SC:O(n)

    private static int climbStairs2(int n) {
        if (n <= 2) return n;
        int first = 1, second = 2;

        for (int i = 1; i <= n-2 ; i++) {
            int tmp = first + second;
            first = second;
            second = tmp;
        }
        return second;
    }// TC: O(n) SC: O(1)
}
