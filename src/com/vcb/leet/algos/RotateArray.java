package com.vcb.leet.algos;

import java.util.Arrays;
/*
    Rotate an array of n elements to the right by k steps.
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(rotateArray(arr, k)));
    }

    private static int[] rotateArray(int[] arr, int k) {

        for (int i = 0; i < k; i++) {
            for (int j = 1; j < arr.length; j++) {
                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
            }
        }
        return arr;
    }
}
