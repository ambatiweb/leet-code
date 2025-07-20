package com.vcb.leet.code.arrays;

/*
    Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example,
    the array nums = [0,1,2,4,5,6,7] might become:
    [4,5,6,7,0,1,2] if it was rotated 4 times.
    [0,1,2,4,5,6,7] if it was rotated 7 times.
    Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the
    array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
    Given the sorted rotated array nums of unique elements, return the minimum element of this array.
    You must write an algorithm that runs in O(log n) time.

    Input: nums = [3,4,5,1,2]
    Output: 1
    Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 */
public class FindMinInSortedArray {
    public static void main(String[] args) {
        int[] num = {4,5,6,1,2,3};
        System.out.println(findMin(num));
    }

    private static int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.min(nums[0], nums[1]);
        if (nums[0] < nums[nums.length - 1]) return nums[0];
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // (left + right) / 2
            // the array is decreasing at mid + 1
            if (nums[mid] > nums[mid+1]) return nums[mid+1];
            // the arrays is decreasing at mid
            if (nums[mid-1] > nums[mid]) return nums[mid];
            // discard the sorted part >> increasing part
            if (nums[left] < nums[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return 0;
    }
} // TC: O(log n), SC: O(1)
