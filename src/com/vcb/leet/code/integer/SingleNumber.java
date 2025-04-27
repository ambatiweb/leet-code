package com.vcb.leet.code.integer;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * Example:
 * Input: nums = [2,2,1]
 * Output: 1
 */
public class SingleNumber {

    public static void main(String[] args) {

        int[] nums = {2, 2, 1};

        System.out.println(singleNumber(nums)); // Output: 1
    }

    public static int singleNumber(int[] nums) {
        // using the xor operator A ^ A = 0, A ^ 0 = A
        // it takes O(n) time and O(1) space complexity
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static int singleNumber2(int[] nums) {
       if(nums.length == 1){
              return nums[0];
       }

       Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }
}
