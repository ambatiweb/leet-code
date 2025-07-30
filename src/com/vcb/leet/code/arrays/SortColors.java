package com.vcb.leet.code.arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(sortColors(nums)));
    }

    private static int[] sortColors(int[] nums) {
        // linear time constant space
        int left = 0, mid = 0, right = nums.length-1;
        while (mid < right){
            if (nums[mid] == 0){
                swap(left, mid, nums);
                left++;
                mid++;
            } else if (nums[mid] == 1){
                mid++;
            } else {
                swap(mid, right, nums);
                right--;
            }
        }
        return nums;
    }

    private static void swap(int i, int j, int[] nums) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
