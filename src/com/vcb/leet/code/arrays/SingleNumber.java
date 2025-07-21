package com.vcb.leet.code.arrays;
/*
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    You must implement a solution with a linear runtime complexity and use only constant extra space.

    Input: nums = [2,2,1]
    Output: 1
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,1,1};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {
        int result = 0;

        for (int i : nums){
            result ^= i;
        }

        return result;
    }
}
