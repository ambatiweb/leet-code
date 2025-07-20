package com.vcb.leet.code.arrays;

import java.util.Arrays;
/*
    Given an integer array nums, move all 0's to the start of it while maintaining the relative
    order of the non-zero elements.
    Note: that you must do this in-place without making a copy of the array.

    Input: nums = [0,1,0,3,12]
    Output: [0,0,1,3,12]
 */
public class MoveZerosLeft {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,4};
        System.out.println(Arrays.toString(moveZerosLeft(arr)));
    }

    private static int[] moveZerosLeft(int[] arr) {
        int n = arr.length;
        int readIndex = n - 1; // Pointer for replacing non zero elements
        int writeIndex = n - 1; // Pointer for reading the elements
        // Iterate from the end of array
        while(readIndex >= 0){
            if (arr[readIndex] > 0){
                arr[writeIndex] = arr[readIndex];
                writeIndex--;
            }
            readIndex--;
        }
        // Fill the remaining positions at the start of the zeros
        while (writeIndex >= 0){
            arr[writeIndex] = 0;
            writeIndex--;
        }

        return arr;

    }
}
