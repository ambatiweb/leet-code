package com.vcb.leet.code.arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums) {
        int actualSum = 0;

        int n = nums.length;
        int expectedSum = n * (n+1)/2;

        for (int i : nums){
            actualSum += i;
        }

        return expectedSum - actualSum;
    }
}
