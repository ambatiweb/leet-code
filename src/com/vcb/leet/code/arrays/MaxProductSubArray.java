package com.vcb.leet.code.arrays;
/*
    Given an integer array nums, find a subarray that has the largest product, and return the product.
    The test cases are generated so that the answer will fit in a 32-bit integer.

    Input: nums = [2,3,-2,4]
    Output: 6
    Explanation: [2,3] has the largest product 6.
 */
public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] array = {3,5,7,2,1};

        System.out.println(maxProduct(array));
    }

    private static int maxProduct(int[] nums) {
        int ans = nums[0];

        int min = 1, max = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {  // -2, 0, -1
                min = 1;
                max = 1;
                ans = Math.max(ans, nums[i]);
                continue;
            }

            int tmp = min;
            min = Math.min(nums[i], Math.min(nums[i] * min, nums[i] * max));
            max = Math.max(nums[i], Math.max(nums[i] * tmp, nums[i] * max));
            ans = Math.max(ans, max);
        }

        return ans;
    }
} // TC: O(n), SC: O(1)
