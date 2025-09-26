package com.vcb.leet.code.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappeared {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,1};
        System.out.println(findAllMissingNumbers(arr));
    }

    private static List<Integer> findAllMissingNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int n = Math.abs(arr[i]);
            if (arr[n-1] > 0){
                arr[n-1] = -1 * arr[n-1];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                list.add(i+1);
            }
        }

        return list;
    }
}
