package com.vcb.leet.code.arrays;

/**
 * Binary Search - Leetcode - 704
 * Given a sorted (in ascending order) integer array nums of n elements ad a target value,
 * write a function to search target in nums.
 * If target exists, then return its index, otherwise return -1.
 * Solve it by log(n) complexity
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 4;
        int result = binarySearch(nums, target);
        System.out.println("Index of " + target + ": " + result); // Output: Index of 3: 2
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // Calculate the mid index
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }
}
