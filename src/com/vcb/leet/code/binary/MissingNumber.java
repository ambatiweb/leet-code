package com.vcb.leet.code.binary;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4};
        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= nums[i] ^ i;
        }
        return missing;
    }
} // TC: O(n), SC: O(1)
