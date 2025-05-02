package com.vcb.leet.code.arrays;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums)); // Output: true
    }

    public static boolean canJump(int[] nums) {
        int maxReachable = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReachable) {
                return false; // Can't reach this index
            }
            maxReachable = Math.max(maxReachable, i + nums[i]);
        }

        return true; // Can reach the last index
    }
}
