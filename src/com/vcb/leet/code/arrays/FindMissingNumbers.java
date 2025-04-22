package com.vcb.leet.code.arrays;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int missingNumber = findMissingNumber(nums);
        System.out.println("Missing number: " + missingNumber); // Output: Missing number: 2
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum; // The missing number
    }
}
