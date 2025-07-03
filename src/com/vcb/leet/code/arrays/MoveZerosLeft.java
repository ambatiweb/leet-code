package com.vcb.leet.code.arrays;

import java.util.Arrays;

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
