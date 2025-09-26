package com.vcb.leet.code.arrays;

import java.util.HashMap;
import java.util.Map;
/*
    Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
    A subarray is a contiguous non-empty sequence of elements within an array.

    Input: nums = [1,1,1], k = 2
    Output: 2
 */
public class SubArraySum {
    public static void main(String[] args) {
        int[] input = {1,1,1,1};
        int k = 2;
        System.out.println(subArraySum(input,k));
    }

    private static int subArraySum(int[] input, int k) {
        int ans = 0;
        int prefix = 0;
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0,1);

        for (final int num : input){
            prefix +=num;
            ans +=count.getOrDefault(prefix - k, 0);
            count.merge(prefix, 1, Integer::sum);
        }
        return ans;
    }

}
