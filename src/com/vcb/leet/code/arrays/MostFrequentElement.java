package com.vcb.leet.code.arrays;

import java.util.HashMap;
import java.util.Map;
/*

 */
public class MostFrequentElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,2,4,5};

        System.out.println(mostFrequentElement(array));
    }

    private static int mostFrequentElement(int[] array) {

        Map<Integer, Integer> map = new HashMap<>();
        // count the frequencies
        for (int num : array){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int maxCount = 0;
        int mostFrequent = array[0];
        // find the element with the maximum frequency
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > maxCount){
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        return mostFrequent;
    }
}
