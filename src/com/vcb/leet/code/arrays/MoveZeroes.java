package com.vcb.leet.code.arrays;

/*
    Given an integer array nums, move all 0's to the end of it while maintaining the relative
    order of the non-zero elements.
    Note: that you must do this in-place without making a copy of the array.

    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " "); // Output: 1 3 12 0 0
        }
    }

    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0; // Pointer for the position of the last non-zero element

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }

        // Fill the remaining positions with zeros
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
