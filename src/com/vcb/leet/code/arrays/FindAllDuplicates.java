package com.vcb.leet.code.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1,4};
        System.out.println(findDuplicates(nums)); // Output: [2, 3]
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Get the index corresponding to the value
            if (nums[index] < 0) {
                duplicates.add(index + 1); // If the value at that index is negative, it's a duplicate
            }
            nums[index] = -nums[index]; // Mark the value as visited by negating it
        }
        return duplicates;
    }
}
